package constants.models;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import langs.LangM;
import sql.Personel;

public class ListModels {
    public static String[] cmbEduList = { LangM.priScholl, LangM.higScholl, LangM.unuScholl, LangM.degreeEdu, LangM.doctorateEdu };
    public static DefaultComboBoxModel<String> educationStatus() {
        final DefaultComboBoxModel<String> educationStatus = new DefaultComboBoxModel<String>(cmbEduList);
        return educationStatus;
    }

    public static DefaultTableModel tbl_table_model;
    public static void tblModel(JTable table) {
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(new String[] { LangM.id, LangM.name, LangM.surname,LangM.password, LangM.mail, LangM.salary, LangM.tel, LangM.gender, LangM.startDate, LangM.tc,LangM.workExper, LangM.eduStatus,LangM.about});
        table.setModel(tbl_table_model);
    }
    public static void addRows(Personel p) {
    tbl_table_model.addRow(new Object[]{p.getId(), p.getName(), p.getSurname(), p.getPassword(), p.getMail(), p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(), p.getTc(), p.getExperiencYear(), p.getEducationStatus(), p.getAbout()});
    
    }


    public static DefaultListModel<String> candidateList=new DefaultListModel<String>();
    public static DefaultListModel<String> cadidateModel() {
    return  candidateList;
    }
    public static void addPersonOnList(Personel p) {
    candidateList.addElement(p.getName()+" "+p.getSurname());
    }
}
