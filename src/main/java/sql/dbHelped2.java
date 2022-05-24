package sql;

import java.sql.SQLException;
import java.util.ArrayList;

import constants.models.ListModels;
import langs.LangM;

public class dbHelped2 extends DbHelper {

    public static ArrayList<Personel> fillPersonel(String tableName, String catagory, String sortItem, int percent,
            boolean isIncreasing) {
        ArrayList<Personel> pList = new ArrayList<>();
        Personel p;
        sortItem = sortItem.isEmpty() ? "id" : sortItem;
        catagory = catagory.isEmpty() ? "id" : catagory;

        int count = (int) ((percent / 100.0) * getSqlRowCount(catagory));
        String sortDirection = isIncreasing == true ? "ASC" : "DESC";

        String query = "SELECT  * from " + tableName + " where " + catagory + " ORDER BY " + sortItem
                + " " + sortDirection + " LIMIT " + count;
        System.out.println(query);
        try {
            con = getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            int status = 0;
            int edu = 0;

            while (rs.next()) {
                p = new Personel();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSurname(rs.getString("surname"));
                p.setPassword(rs.getString("password"));
                p.setMail(rs.getString("mail"));
                p.setSalary(rs.getInt("salary"));
                p.setTel(rs.getString("tel"));
                if (rs.getString("gender").equals("male")) {
                    p.setGender(LangM.male);
                } else {
                    p.setGender(LangM.fmale);

                }
                p.setStartingOfWork(rs.getString("starting_of_work"));
                p.setTc(rs.getString("tc"));
                p.setExperiencYear(rs.getInt("experience_year"));
                switch (rs.getString("education_status")) {
                    case "priScholl":
                        edu = 0;
                        break;
                    case "higScholl":
                        edu = 1;
                        break;
                    case "unuScholl":
                        edu = 2;
                        break;
                    case "degreeEdu":
                        edu = 3;
                        break;
                    case "doctorateEdu":
                        edu = 4;
                        break;
                    default:
                        break;
                }
                p.setEducaitonStatus(ListModels.cmbEduList[edu]);
                switch (rs.getString("status")) {
                    case "networkManeger":
                        status = 0;
                        break;
                    case "projectManeger":
                        status = 1;
                        break;
                    case "softwareEngineer":
                        status = 2;
                        break;
                    case "admin":
                        status = 3;
                        break;
                    case "designer":
                        status = 4;
                        break;
                    case "financeManeger":
                        status = 5;
                        break;
                    case "socialMediaManeger":
                        status = 6;
                        break;
                    default:
                        break;
                }

                p.setStatus(ListModels.cmbStatus[status]);
                p.setAbout(rs.getString("about"));
                pList.add(p);
            }
            con.close();
        } catch (SQLException e) {
            showError(e);
        }
        return pList;
    }

    public static void fillTable2(String catagory, String sortItem, int percent,
            boolean isIncreasing) {
        ArrayList<Personel> pList = fillPersonel("info", catagory, sortItem, percent, isIncreasing);
        ListModels.tbl_table_model.setRowCount(0);
        for (int i = 0; i < pList.size(); i++) {
            ListModels.tbl_table_model
                    .addRow(new Object[] { pList.get(i).getId(), pList.get(i).getName(), pList.get(i).getSurname(),
                            pList.get(i).getPassword(), pList.get(i).getMail(), pList.get(i).getSalary(),
                            pList.get(i).getTel(), pList.get(i).getGender(), pList.get(i).getStartingOfWork(),
                            pList.get(i).getTc(), pList.get(i).getExperiencYear(), pList.get(i).getEducationStatus(),
                            pList.get(i).getStatus(), pList.get(i).getAbout() });
        }
    }

    public static boolean isAdmin() {
        String query = "SELECT * FROM info WHERE status= 'admin' and name= 'admin*13' and password= 'admin*13'";
        try {
            con = getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);
            return rs.next();
        } catch (SQLException e) {
            showError(e);
            return false;
        }
    }

    public static int isPersonel(String mail, String password) {
        String query = "SELECT * FROM info WHERE  mail= '"+mail+"' and password= '"+password+"'";
        int id=-1;
        try {
            con = getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);
            if(rs.next()){
            id=rs.getInt("id");
            }
        } catch (SQLException e) {
            showError(e);
        }
        return id;
    }

    public static Personel getFieldData(int index) {
        Personel p = new Personel();
        int columnCount = ListModels.tbl_table_model.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            p.perLi.add(ListModels.tbl_table_model.getValueAt(index, i));
        }

        return new Personel(Integer.parseInt(p.perLi.get(0) + ""), p.perLi.get(1) + "", p.perLi.get(2) + "",
                p.perLi.get(3) + "", p.perLi.get(4) + "",
                Integer.parseInt(p.perLi.get(5) + ""), p.perLi.get(6) + "", p.perLi.get(7) + "", p.perLi.get(8) + "",
                p.perLi.get(9) + "", Integer.parseInt(p.perLi.get(10) + ""),
                p.perLi.get(11) + "", p.perLi.get(12) + "", p.perLi.get(13) + "");
    }

}
