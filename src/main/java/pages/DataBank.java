//Bisimillahirrahmanirrahim
package pages;

import constants.models.ListModels;
import functions.PageP;

public class DataBank extends javax.swing.JFrame {

    public DataBank() {
        initComponents();
        ListModels.tblModel(tbl_data);
    }

    @SuppressWarnings("unchecked")
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 700));
        setPreferredSize(new java.awt.Dimension(1040, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txf_surname.setText("textFeild1");
        getContentPane().add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 123, 35));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        txf_mail.setText("textFeild1");
        getContentPane().add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 123, 35));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        lb_salary.setText("Maaş");
        getContentPane().add(lb_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txf_phone.setText("textFeild1");
        getContentPane().add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 123, 35));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        txf_salary.setText("textFeild1");
        getContentPane().add(txf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 123, 35));

        lb_startToWork.setText("Başlama Tarihi");
        getContentPane().add(lb_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        txf_tc.setText("textFeild1");
        getContentPane().add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        txf_experience.setText("textFeild1");
        getContentPane().add(txf_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 123, 35));

        lb_experience.setText("Çalışma Tecrübesi");
        getContentPane().add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        txf_startToWork.setText("textFeild1");
        getContentPane().add(txf_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 123, 35));

        lb_education.setText("Eğitim Durumu");
        getContentPane().add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 530, 210));

        txf_name.setText("textFeild1");
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 123, 35));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txf_password.setText("textFeild1");
        getContentPane().add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 123, 35));

        txf_id.setText("textFeild1");
        getContentPane().add(txf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 123, 35));

        lb_id.setText("İd");
        getContentPane().add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        getContentPane().add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        getContentPane().add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        getContentPane().add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, -1));

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
        jScrollPane1.setViewportView(tbl_data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 690, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_educaiton;
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
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_experience;
    private view.TextField.TextFeild txf_id;
    private view.TextField.TextFeild txf_mail;
    private view.TextField.TextFeild txf_name;
    private view.TextField.TextFeild txf_password;
    private view.TextField.TextFeild txf_phone;
    private view.TextField.TextFeild txf_salary;
    private view.TextField.TextFeild txf_startToWork;
    private view.TextField.TextFeild txf_surname;
    private view.TextField.TextFeild txf_tc;
    // End of variables declaration//GEN-END:variables
}
