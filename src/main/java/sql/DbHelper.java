package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JOptionPane;

import constants.models.ListModels;

public class DbHelper {
    private static String dbUrl = "jdbc:sqlite:personel_data.db";
    static Connection con;
    static Statement state;
    static ResultSet rs;
    static PreparedStatement pStm;

    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(dbUrl);
    }

    public static void showError(SQLException e) {
        System.out.println("Error code " + e.getErrorCode());
        System.out.println("Error message " + e.getMessage());
    }
    public static double getSqlRowCount() {
        double count=0;
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            String query = "SELECT count(*) as countRow FROM info";
            rs = state.executeQuery(query);
            count=rs.getInt("countRow");
            System.out.println(count);
            con.close();
        } catch (SQLException e) {
            showError(e);
        }
        return count;
        
    }
    public static int getMaxId() {
        String query = "SELECT MAX(id) as mId FROM info";
        int maxId = 0;
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            maxId = rs.getInt("mId");
            con.close();
        } catch (SQLException e) {
            showError(e);
        }
        return 1 + maxId;
    }
    public static void fillTable() {
        ListModels.tbl_table_model.setRowCount(0);
        String query = "SELECT * FROM info";
        Personel p = new Personel();
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSurname(rs.getString("surname"));
                p.setPassword(rs.getString("password"));
                p.setMail(rs.getString("mail"));
                p.setSalary(rs.getInt("salary"));
                p.setTel(rs.getString("tel"));
                p.setGender(rs.getString("gender"));
                p.setStartingOfWork(rs.getString("starting_of_work"));
                p.setTc(rs.getString("tc"));
                p.setExperiencYear(rs.getInt("experience_year"));
                p.setEducaitonStatus(rs.getString("education_status"));
                p.setAbout(rs.getString("about"));
                ListModels.tbl_table_model.addRow(new Object[] { p.getId(), p.getName(), p.getSurname(),
                        p.getPassword(), p.getMail(), p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(),
                        p.getTc(), p.getExperiencYear(), p.getEducationStatus(), p.getAbout() });
            //System.out.println(ListModels.tbl_table_model.getDataVector());
            
                    }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    public static void searchData(String search) {
        ListModels.tbl_table_model.setRowCount(0);
        String query = search;
        Personel p = new Personel();
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSurname(rs.getString("surname"));
                p.setPassword(rs.getString("password"));
                p.setMail(rs.getString("mail"));
                p.setSalary(rs.getInt("salary"));
                p.setTel(rs.getString("tel"));
                p.setGender(rs.getString("gender"));
                p.setStartingOfWork(rs.getString("starting_of_work"));
                p.setTc(rs.getString("tc"));
                p.setExperiencYear(rs.getInt("experience_year"));
                p.setEducaitonStatus(rs.getString("education_status"));
                p.setAbout(rs.getString("about"));
                ListModels.tbl_table_model.addRow(new Object[] { p.getId(), p.getName(), p.getSurname(),
                        p.getPassword(), p.getMail(), p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(),
                        p.getTc(), p.getExperiencYear(), p.getEducationStatus(), p.getAbout() });
            //System.out.println(ListModels.tbl_table_model.getDataVector());
            
                    }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }




    public static Personel fillObject(int id) {
        String query = "SELECT * FROM info WHERE id =" + id;
        Personel p = new Personel();
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSurname(rs.getString("surname"));
                p.setPassword(rs.getString("password"));
                p.setMail(rs.getString("mail"));
                p.setSalary(rs.getInt("salary"));
                p.setTel(rs.getString("tel"));
                p.setGender(rs.getString("gender"));
                p.setStartingOfWork(rs.getString("starting_of_work"));
                p.setTc(rs.getString("tc"));
                p.setExperiencYear(rs.getInt("experience_year"));
                p.setEducaitonStatus(rs.getString("education_status"));
                p.setAbout(rs.getString("about"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    public static void deleteData(int id) {
        String query = "DELETE FROM info where id =" + id;

        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            state.executeUpdate(query);
            con.close();
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        }

    }

    public void addData(Personel p) {
        String query = "INSERT INTO info (id, name, surname, password, mail, salary, tel, gender, starting_of_work, tc, experience_year, education_status, about) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DbHelper.getConnection();
            pStm = con.prepareStatement(query);

            pStm.setInt(1, getMaxId());
            pStm.setString(2, p.getName());
            pStm.setString(3, p.getSurname());
            pStm.setString(4, p.getPassword());
            pStm.setString(5, p.getMail());
            pStm.setInt(6, p.getSalary());
            pStm.setString(7, p.getTel());
            pStm.setString(8, p.getGender());
            pStm.setString(9, p.getStartingOfWork());
            pStm.setString(10, p.getTc());
            pStm.setInt(11, p.getExperiencYear());
            pStm.setString(12, p.getEducationStatus());
            pStm.setString(13, p.getAbout());
            pStm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarılı bir şekilde eklendi");
            pStm.close();
            con.close();
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        }
    }

    public void updateData(int id, Personel p) {
        String query = "UPDATE info SET  name   = ?, surname = ?, password = ?, mail = ?, salary = ?, tel = ?, gender= ?, starting_of_work =?,tc=?,experience_year=?, education_status=?,about=? WHERE id ="
                + id;

        try {
            con = DbHelper.getConnection();
            pStm = con.prepareStatement(query);

            pStm.setString(1, p.getName());
            pStm.setString(2, p.getSurname());
            pStm.setString(3, p.getPassword());
            pStm.setString(4, p.getMail());
            pStm.setInt(5, p.getSalary());
            pStm.setString(6, p.getTel());
            pStm.setString(7, p.getGender());
            pStm.setString(8, p.getStartingOfWork());
            pStm.setString(9, p.getTc());
            pStm.setInt(10, p.getExperiencYear());
            pStm.setString(11, p.getEducationStatus());
            pStm.setString(12, p.getAbout());
            pStm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarılı bir şekilde güncellendi");
            pStm.close();
            con.close();
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        }
    }

}


/* 
public static void fillTable2() {
        ListModels.tbl_table_model.setRowCount(0);
        String query = "SELECT * FROM info";

        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            while (rs.next()) {
                Personel p = new Personel();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSurname(rs.getString("surname"));
                p.setPassword(rs.getString("password"));
                p.setMail(rs.getString("mail"));
                p.setSalary(rs.getInt("salary"));
                p.setTel(rs.getString("tel"));
                p.setGender(rs.getString("gender"));
                p.setStartingOfWork(rs.getString("starting_of_work"));// !hatalı
                p.setTc(rs.getString("tc"));
                p.setExperiencYear(rs.getInt("experience_year"));
                p.setEducaitonStatus(rs.getString("education_status"));
                p.setAbout(rs.getString("about"));
                ListModels.tbl_table_model.addRow(new Object[] { p.getId(), p.getName(), p.getSurname(),
                        p.getPassword(), p.getMail(), p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(),
                        p.getTc(), p.getExperiencYear(), p.getEducationStatus(), p.getAbout() });
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }



*/