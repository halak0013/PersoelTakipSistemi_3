//Bisimillahirrahmanirrahim
package pages;

import java.sql.Date;

import constants.models.ListModels;
import functions.PageP;
import regex.RegexC;
import sql.DbHelper;
import sql.Personel;

public class DataBank extends javax.swing.JFrame {
    DbHelper db = new DbHelper();

    public DataBank() {
        initComponents();
        ListModels.tblModel(tbl_data);
        imageP();
    }

    private void imageP() {
        svg_search.scale();
        lb_perValue.setText("Yüzde " + sld_percent.getValue() + "% göster");
    }

    public void name() {
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        StrtEnd = new javax.swing.ButtonGroup();
        lb_name = new javax.swing.JLabel();
        txf_surname = new view.TextField.TextFeild();
        lb_surname = new javax.swing.JLabel();
        txf_mail = new view.TextField.TextFeild();
        lb_mail = new javax.swing.JLabel();
        lb_salary = new javax.swing.JLabel();
        txf_phone = new view.TextField.TextFeild();
        lb_phone = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        txf_salary = new view.TextField.TextFeild();
        lb_startToWork = new javax.swing.JLabel();
        txf_tc = new view.TextField.TextFeild();
        lb_tc = new javax.swing.JLabel();
        lb_experience = new javax.swing.JLabel();
        txf_startToWork = new view.TextField.TextFeild();
        lb_education = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_about = new javax.swing.JTextArea();
        txf_name = new view.TextField.TextFeild();
        lb_about = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        txf_password = new view.TextField.TextFeild();
        txf_id = new view.TextField.TextFeild();
        lb_id = new javax.swing.JLabel();
        btr_male = new javax.swing.JRadioButton();
        btr_fmale = new javax.swing.JRadioButton();
        cmb_educaiton = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        svg_search = new view.image.SvgImage();
        txf_search = new view.TextField.TextFeild();
        bt_update = new view.buttons.ButtonN();
        bt_sil = new view.buttons.ButtonN();
        bt_add = new view.buttons.ButtonN();
        jPanel1 = new javax.swing.JPanel();
        btr_startSort = new javax.swing.JRadioButton();
        btr_endSort = new javax.swing.JRadioButton();
        sld_percent = new javax.swing.JSlider();
        lb_perValue = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkb_tc = new javax.swing.JCheckBox();
        chk_id = new javax.swing.JCheckBox();
        chk_name = new javax.swing.JCheckBox();
        chk_salary = new javax.swing.JCheckBox();
        spn_experience = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(1350, 800));
        setPreferredSize(new java.awt.Dimension(1350, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txf_surname.setText("textFeild1");
        getContentPane().add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 123, 35));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txf_mail.setText("textFeild1");
        getContentPane().add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 123, 35));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        lb_salary.setText("Maaş");
        getContentPane().add(lb_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txf_phone.setText("textFeild1");
        getContentPane().add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 123, 35));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        txf_salary.setText("2131223");
        getContentPane().add(txf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 123, 35));

        lb_startToWork.setText("Başlama Tarihi");
        getContentPane().add(lb_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        txf_tc.setText("textFeild1");
        getContentPane().add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        lb_experience.setText("Çalışma Tecrübesi");
        getContentPane().add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        txf_startToWork.setText("2020-03-29");
        getContentPane().add(txf_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 123, 35));

        lb_education.setText("Eğitim Durumu");
        getContentPane().add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 530, 210));

        txf_name.setText("textFeild1");
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 123, 35));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        txf_password.setText("textFeild1");
        getContentPane().add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 123, 35));

        txf_id.setText("textFeild1");
        getContentPane().add(txf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 123, 35));

        lb_id.setText("İd");
        getContentPane().add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        getContentPane().add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        getContentPane().add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        getContentPane().add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_data.setMinimumSize(new java.awt.Dimension(300, 100));
        tbl_data.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setViewportView(tbl_data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1260, 320));

        svg_search.setImage("search");
        svg_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                svg_searchMousePressed(evt);
            }
        });
        getContentPane().add(svg_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 20, 20));

        txf_search.setToolTipText("");
        getContentPane().add(txf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 460, 50));

        bt_update.setText("Güncelle");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });
        getContentPane().add(bt_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 100, 40));

        bt_sil.setText("Sil");
        bt_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_silActionPerformed(evt);
            }
        });
        getContentPane().add(bt_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 100, 40));

        bt_add.setText("Ekle");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        getContentPane().add(bt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 330, 100, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtreler"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StrtEnd.add(btr_startSort);
        btr_startSort.setText("Baştan");
        jPanel1.add(btr_startSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 17, -1, -1));

        StrtEnd.add(btr_endSort);
        btr_endSort.setText("Sondan");
        jPanel1.add(btr_endSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 17, -1, -1));

        sld_percent.setValue(100);
        sld_percent.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_percentStateChanged(evt);
            }
        });
        jPanel1.add(sld_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 188, -1));

        lb_perValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_perValue.setText("jLabel1");
        jPanel1.add(lb_perValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sıralama"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkb_tc.setText("Kimlik No");
        jPanel2.add(chkb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        chk_id.setText("İd");
        jPanel2.add(chk_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        chk_name.setText("İsim");
        jPanel2.add(chk_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        chk_salary.setText("Maaş");
        jPanel2.add(chk_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 340, 120));

        spn_experience.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        getContentPane().add(spn_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void svg_searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_svg_searchMousePressed

    }// GEN-LAST:event_svg_searchMousePressed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_addActionPerformed
        // RegexC.textPatern(txf_name.getText());
        //RegexC.passwordPatern(txf_password.getText());
        db.addData(objectPro());
    }// GEN-LAST:event_bt_addActionPerformed

    private void sld_percentStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_sld_percentStateChanged
        lb_perValue.setText("Yüzde " + sld_percent.getValue() + "% göster");
    }// GEN-LAST:event_sld_percentStateChanged

    private void bt_silActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_silActionPerformed
        int id;
        if (tbl_data.getSelectedRow() > -1) {
            id = (int) tbl_data.getValueAt(tbl_data.getSelectedRow(), 0);
            DbHelper.deleteData(id);
        }

    }// GEN-LAST:event_bt_silActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_updateActionPerformed
        int id;
        if (tbl_data.getSelectedRow() > -1) {
            id = (int) tbl_data.getValueAt(tbl_data.getSelectedRow(), 0);
            db.updateData(id, objectPro());
        }
    }// GEN-LAST:event_bt_updateActionPerformed

    public Personel objectPro() {
        String gender="";
        if (btr_male.isSelected()) {
            gender = "Erkek";
        }else{
        gender="Kadın";
        }
        return new Personel( txf_name.getText(),
                txf_surname.getText(), txf_password.getText(), txf_mail.getText(),
                Integer.parseInt(txf_salary.getText()), txf_phone.getText(),
                gender, Date.valueOf(txf_startToWork.getText()), txf_tc.getText(),
                Integer.parseInt(spn_experience.getValue().toString()) ,
                cmb_educaiton.getSelectedItem().toString(), txa_about.getText());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PageP.theme();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup StrtEnd;
    private view.buttons.ButtonN bt_add;
    private view.buttons.ButtonN bt_sil;
    private view.buttons.ButtonN bt_update;
    private javax.swing.JRadioButton btr_endSort;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.JRadioButton btr_startSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_id;
    private javax.swing.JCheckBox chk_name;
    private javax.swing.JCheckBox chk_salary;
    private javax.swing.JCheckBox chkb_tc;
    private javax.swing.JComboBox<String> cmb_educaiton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_about;
    private javax.swing.JLabel lb_education;
    private javax.swing.JLabel lb_experience;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_mail;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_perValue;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_salary;
    private javax.swing.JLabel lb_startToWork;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private javax.swing.JSlider sld_percent;
    private javax.swing.JSpinner spn_experience;
    private view.image.SvgImage svg_search;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_id;
    private view.TextField.TextFeild txf_mail;
    private view.TextField.TextFeild txf_name;
    private view.TextField.TextFeild txf_password;
    private view.TextField.TextFeild txf_phone;
    private view.TextField.TextFeild txf_salary;
    private view.TextField.TextFeild txf_search;
    private view.TextField.TextFeild txf_startToWork;
    private view.TextField.TextFeild txf_surname;
    private view.TextField.TextFeild txf_tc;
    // End of variables declaration//GEN-END:variables
}
