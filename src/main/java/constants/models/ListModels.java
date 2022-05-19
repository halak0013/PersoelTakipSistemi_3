package constants.models;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sql.Personel;

public class ListModels {
    public static String[] cmbEduList = { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" };
    public static DefaultComboBoxModel<String> educationStatus() {
        final DefaultComboBoxModel<String> educationStatus = new DefaultComboBoxModel<String>(cmbEduList);
        return educationStatus;
    }

    public static DefaultTableModel tbl_table_model;
    public static void tblModel(JTable table) {
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(new String[] { "İd", "İsim", "Soyad","Şifre", "Mail", "Maaş", "Telefono", "Cinsiyet", "Başlangıç Tarihi", "TC","Çalışma Tecrübesi ", "Eğitim Durumu", "Açıklama" });
        table.setModel(tbl_table_model);
    }
    public static void addRows(Personel p) {
    tbl_table_model.addRow(new Object[]{p.getId(), p.getName(), p.getSurname(), p.getPassword(), p.getMail(), p.getSalary(), p.getTel(), p.getGender(), p.getStartingOfWork(), p.getTc(), p.getExperiencYear(), p.getEducationStatus(), p.getAbout()});
    
    }
}
