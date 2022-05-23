//Bisimillahirrahmanirrahim
package constants.models;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import langs.LangM;
import sql.Personel;

public class ListModels {

    // !eğitim durumu
    public static final String[] cmbEduList = { LangM.priScholl, LangM.higScholl, LangM.unuScholl, LangM.degreeEdu,LangM.doctorateEdu };
    public static DefaultComboBoxModel<String> educationStatus() {
        final DefaultComboBoxModel<String> educationStatus = new DefaultComboBoxModel<String>(cmbEduList);
        return educationStatus;
    }

    // !personel tipi
    public static DefaultComboBoxModel<String> cmbStatusList() {
        final String[] cmbStatus = { LangM.networkManeger, LangM.projectManeger, LangM.softwareEngineer, LangM.admin,
                LangM.designer, LangM.financeManeger, LangM.socialMediaManeger };
        final DefaultComboBoxModel<String> cmbStatusModel = new DefaultComboBoxModel<String>(cmbStatus);
        return cmbStatusModel;
    }

    // !dil
    public static DefaultComboBoxModel<String> cmbLangList() {
        final String[] cmbLang = { LangM.turkish, LangM.english };
        final DefaultComboBoxModel<String> cmbLangModel = new DefaultComboBoxModel<String>(cmbLang);
        return cmbLangModel;
    }

    // !tema
    public static DefaultComboBoxModel<String> cmbThemeList() {
        final String[] cmbTheme = { LangM.darkOrange, LangM.darkBlue };
        final DefaultComboBoxModel<String> cmbLThemeModel = new DefaultComboBoxModel<String>(cmbTheme);
        return cmbLThemeModel;
    }

    // !tablo
    public static DefaultTableModel tbl_table_model;
    public static void tblModel(JTable table) {
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(
                new String[] { LangM.id, LangM.name, LangM.surname, LangM.password, LangM.mail, LangM.salary, LangM.tel,
                        LangM.gender, LangM.startDate, LangM.tc, LangM.workExper, LangM.eduStatus, LangM.about });
        table.setModel(tbl_table_model);
    }

    public static void addRows(Personel p) {
        tbl_table_model.addRow(new Object[] { p.getId(), p.getName(), p.getSurname(), p.getPassword(), p.getMail(),
                p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(), p.getTc(), p.getExperiencYear(),
                p.getEducationStatus(), p.getAbout() });

    }

    // !personel listesi
    public static DefaultListModel<String> candidateList = new DefaultListModel<String>();

    public static DefaultListModel<String> cadidateModel() {
        return candidateList;
    }

    public static void addPersonOnList(Personel p) {
        candidateList.addElement(p.getId() + ". İsmi " + p.getName() + " Soyismi " + p.getSurname() + " Eğitimi Durumu "
                + p.getEducationStatus() + " Çalışma tecrübesi " + p.getExperiencYear());
    }
}
