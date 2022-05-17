//Bisimillahirrahmanirrahim
package pages;

import constants.models.ListModels;
import functions.PageP;
import regex.RegexC;

public class DataBank extends javax.swing.JFrame {

    public DataBank() {
        initComponents();
        ListModels.tblModel(tbl_data);
        imageP();
    }

    private void imageP() {
        svg_search.scale();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        txf_experience = new view.TextField.TextFeild();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 700));
        setPreferredSize(new java.awt.Dimension(1040, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txf_surname.setText("textFeild1");
        getContentPane().add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 123, 35));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        txf_mail.setText("textFeild1");
        getContentPane().add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 123, 35));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        lb_salary.setText("Maaş");
        getContentPane().add(lb_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txf_phone.setText("textFeild1");
        getContentPane().add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 123, 35));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        txf_salary.setText("textFeild1");
        getContentPane().add(txf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 123, 35));

        lb_startToWork.setText("Başlama Tarihi");
        getContentPane().add(lb_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        txf_tc.setText("textFeild1");
        getContentPane().add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        txf_experience.setText("textFeild1");
        getContentPane().add(txf_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 123, 35));

        lb_experience.setText("Çalışma Tecrübesi");
        getContentPane().add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        txf_startToWork.setText("textFeild1");
        getContentPane().add(txf_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 123, 35));

        lb_education.setText("Eğitim Durumu");
        getContentPane().add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 530, 210));

        txf_name.setText("textFeild1");
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 123, 35));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txf_password.setText("textFeild1");
        getContentPane().add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 123, 35));

        txf_id.setText("textFeild1");
        getContentPane().add(txf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 123, 35));

        lb_id.setText("İd");
        getContentPane().add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        getContentPane().add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        getContentPane().add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        getContentPane().add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 120, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 690, 760));

        svg_search.setImage("search");
        svg_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                svg_searchMousePressed(evt);
            }
        });
        getContentPane().add(svg_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 20, 20));

        txf_search.setText("textFeild1");
        getContentPane().add(txf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 260, 40));

        bt_update.setText("Güncelle");
        getContentPane().add(bt_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 40));

        bt_sil.setText("Sil");
        getContentPane().add(bt_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, 40));

        bt_add.setText("Ekle");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        getContentPane().add(bt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, 40));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void svg_searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svg_searchMousePressed
        System.out.println("arıyor");
    }//GEN-LAST:event_svg_searchMousePressed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        //RegexC.textPatern(txf_name.getText());
        RegexC.passwordPatern(txf_password.getText());
    }//GEN-LAST:event_bt_addActionPerformed

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
    private view.buttons.ButtonN bt_add;
    private view.buttons.ButtonN bt_sil;
    private view.buttons.ButtonN bt_update;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_educaiton;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_salary;
    private javax.swing.JLabel lb_startToWork;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private view.image.SvgImage svg_search;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_experience;
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
