//Bisimillahirrahmanirrahim
package pages;

import constants.models.ListModels;
import langs.LangM;
import sql.DbHelper;
import sql.Personel;

public class PersonelP extends javax.swing.JFrame {

    DbHelper db = new DbHelper();

    public PersonelP(int id) {
        initComponents();
        LanPro();
        cmb_status.setModel(ListModels.cmbStatusList());
        cmb_educaiton.setModel(ListModels.educationStatus());
        fillFields(id, "info", false);
        disableFields();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        StrtEnd = new javax.swing.ButtonGroup();
        search = new javax.swing.ButtonGroup();
        lb_name = new javax.swing.JLabel();
        lb_surname = new javax.swing.JLabel();
        lb_mail = new javax.swing.JLabel();
        lb_phone = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        lb_status = new javax.swing.JLabel();
        lb_experience = new javax.swing.JLabel();
        lb_education = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_about = new javax.swing.JTextArea();
        lb_about = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        btr_male = new javax.swing.JRadioButton();
        btr_fmale = new javax.swing.JRadioButton();
        cmb_educaiton = new javax.swing.JComboBox<>();
        spn_experience = new javax.swing.JSpinner();
        lb_salary = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        lb_tc = new javax.swing.JLabel();
        tx_mail = new javax.swing.JLabel();
        tx_name = new javax.swing.JLabel();
        tx_surname = new javax.swing.JLabel();
        tx_password = new javax.swing.JLabel();
        tx_salary = new javax.swing.JLabel();
        tx_tc = new javax.swing.JLabel();
        tx_phone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        lb_status.setText("Meslek");
        getContentPane().add(lb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        lb_experience.setText("Çalışma Tecrübesi");
        getContentPane().add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        lb_education.setText("Eğitim Durumu");
        getContentPane().add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 530, 250));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        getContentPane().add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        getContentPane().add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        getContentPane().add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, -1));

        spn_experience.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        getContentPane().add(spn_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 110, -1));

        lb_salary.setText("Maaş");
        getContentPane().add(lb_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        tx_mail.setText("jLabel1");
        getContentPane().add(tx_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        tx_name.setText("jLabel1");
        getContentPane().add(tx_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        tx_surname.setText("jLabel1");
        getContentPane().add(tx_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        tx_password.setText("jLabel1");
        getContentPane().add(tx_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        tx_salary.setText("jLabel1");
        getContentPane().add(tx_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        tx_tc.setText("jLabel1");
        getContentPane().add(tx_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        tx_phone.setText("jLabel1");
        getContentPane().add(tx_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void disableFields() {

    cmb_status.setEnabled(false);
    cmb_educaiton.setEnabled(false);
    spn_experience.setEnabled(false);
    btr_fmale.setEnabled(false);
    btr_male.setEnabled(false);
    
    }

    public void fillFields(int id, String tableName, boolean isChek) {
        Personel p = db.fillObject(id, tableName, isChek);

        int status = 0;
        int edu = 0;
        switch (p.getEducationStatus()) {
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

        switch (p.getStatus()) {
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
        cmb_status.setSelectedIndex(status);
        tx_name.setText(p.getName());
        tx_surname.setText(p.getSurname());
        tx_tc.setText(p.getTc());
        tx_phone.setText(p.getTel());
        tx_mail.setText(p.getMail());
        tx_salary.setText(p.getSalary()+"");
        tx_password.setText(p.getPassword());
        txa_about.setText(p.getAbout());

        if (p.getGender().equals("male")) {
            btr_fmale.setSelected(false);
            btr_male.setSelected(true);
        } else {
            btr_male.setSelected(false);
            btr_fmale.setSelected(true);
        }
        cmb_educaiton.setSelectedIndex(edu);
        spn_experience.setValue(p.getExperiencYear());

    }

    private void LanPro() {
        lb_name.setText(LangM.name);
        lb_surname.setText(LangM.surname);
        lb_education.setText(LangM.eduStatus);
        lb_mail.setText(LangM.mail);
        lb_password.setText(LangM.password);
        lb_salary.setText(LangM.password);
        lb_phone.setText(LangM.tel);
        lb_status.setText(LangM.tc);
        lb_gender.setText(LangM.gender);
        lb_experience.setText(LangM.workExper);
        lb_about.setText(LangM.about);
        lb_salary.setText(LangM.salary);

        btr_male.setText(LangM.male);
        btr_fmale.setText(LangM.fmale);


        
        
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup StrtEnd;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_educaiton;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_about;
    private javax.swing.JLabel lb_education;
    private javax.swing.JLabel lb_experience;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_mail;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_salary;
    private javax.swing.JLabel lb_status;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private javax.swing.ButtonGroup search;
    private javax.swing.JSpinner spn_experience;
    private javax.swing.JLabel tx_mail;
    private javax.swing.JLabel tx_name;
    private javax.swing.JLabel tx_password;
    private javax.swing.JLabel tx_phone;
    private javax.swing.JLabel tx_salary;
    private javax.swing.JLabel tx_surname;
    private javax.swing.JLabel tx_tc;
    private javax.swing.JTextArea txa_about;
    // End of variables declaration//GEN-END:variables
}
    /* private boolean fieldController() {
        if (!RegexC.textPatern(tx_name.getText(), LangM.correctName)) {
            return false;
        }
        if (!RegexC.textPatern(tx_surname.getText(), LangM.correctSurname)) {
            return false;
        }
        if (!RegexC.passwordPatern(tx_password.getText(), LangM.correctPassword)) {
            return false;
        }
        if (!RegexC.mailPatern(tx_mail.getText(), LangM.correctMail)) {
            return false;
        }
        if (!RegexC.numberPatern(tx_tc.getText(), 11, LangM.correctTc)) {
            return false;
        }
        if (!RegexC.phonePatern(tx_phone.getText(), LangM.correctPhone)) {
            return false;
        }
        if (!btr_fmale.isSelected() && !btr_male.isSelected()) {
            System.out.println("hatalı");

            return false;
        }
        System.out.println("başarılı");

        return true;
    } */