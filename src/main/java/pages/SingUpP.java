//Bisimillahirrahmanirrahim
package pages;

import javax.swing.JOptionPane;

import constants.models.ListModels;
import functions.MyList;
import functions.Setting;
import langs.LangM;
import regex.RegexC;
import sql.DbHelper;
import sql.Personel;
import sql.dbHelped2;

public class SingUpP extends javax.swing.JFrame {

    DbHelper db = new DbHelper();

    public SingUpP() {
        initComponents();
        LanPro();
        cmb_educaiton.setModel(ListModels.educationStatus());
        clearFields();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        StrtEnd = new javax.swing.ButtonGroup();
        search = new javax.swing.ButtonGroup();
        lb_name = new javax.swing.JLabel();
        txf_surname = new view.TextField.TextFeild();
        lb_surname = new javax.swing.JLabel();
        txf_mail = new view.TextField.TextFeild();
        lb_mail = new javax.swing.JLabel();
        txf_phone = new view.TextField.TextFeild();
        lb_phone = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        txf_tc = new view.TextField.TextFeild();
        lb_tc = new javax.swing.JLabel();
        lb_experience = new javax.swing.JLabel();
        lb_education = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_about = new javax.swing.JTextArea();
        txf_name = new view.TextField.TextFeild();
        lb_about = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        txf_password = new view.TextField.TextFeild();
        btr_male = new javax.swing.JRadioButton();
        btr_fmale = new javax.swing.JRadioButton();
        cmb_educaiton = new javax.swing.JComboBox<>();
        spn_experience = new javax.swing.JSpinner();
        lb_password1 = new javax.swing.JLabel();
        txf_password1 = new view.TextField.TextFeild();
        bt_save = new view.buttons.ButtonN();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txf_surname.setText("textFeild1");
        getContentPane().add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 123, 35));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txf_mail.setText("textFeild1");
        getContentPane().add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 123, 35));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txf_phone.setText("textFeild1");
        getContentPane().add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 123, 35));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        txf_tc.setText("textFeild1");
        getContentPane().add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

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

        txf_name.setText("textFeild");
        txf_name.setA_textT("ismi girin");
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 123, 35));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        txf_password.setText("textFeild1");
        getContentPane().add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 123, 35));

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

        lb_password1.setText("Parola");
        getContentPane().add(lb_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        txf_password1.setText("textFeild1");
        getContentPane().add(txf_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 123, 35));

        bt_save.setText("Admine Kaydı Gönder");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });
        getContentPane().add(bt_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 170, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonN1ActionPerformed
        if (txf_password.getText().equals(txf_password1.getText())) {
            if (!dbHelped2.isMailUniq(txf_mail.getText())) {
                if (fieldControllerAdd()) {
                    try {
                        db.addData(objectPro(), "singUpForms");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, LangM.fieldError, LangM.error,
                                JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                        Setting.addLog("\n" + e.getMessage() + getClass().getName());
                    }
                    clearFields();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, LangM.uniqMail, LangM.error,
                JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, LangM.notSamePass, LangM.error,
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_buttonN1ActionPerformed

    private Personel objectPro() {
        String gender = "";
        String edu = "";
        switch (cmb_educaiton.getSelectedIndex()) {
            case 0:
                edu = "priScholl";
                break;
            case 1:
                edu = "higScholl";
                break;
            case 2:
                edu = "unuScholl";
                break;
            case 3:
                edu = "degreeEdu";
                break;
            case 4:
                edu = "doctorateEdu";
                break;
            default:
                break;
        }
        if (btr_male.isSelected()) {
            gender = "male";
        } else {
            gender = "fmale";
        }
        return new Personel(txf_name.getText(),
                txf_surname.getText(), txf_password.getText(), txf_mail.getText(),
                txf_phone.getText(),
                gender, txf_tc.getText(),
                Integer.parseInt(spn_experience.getValue().toString()),
                edu, txa_about.getText());
    }

    private void clearFields() {
        txa_about.setText("");
        txf_mail.setText("");
        txf_name.setText("");
        txf_password.setText("");
        txf_password1.setText("");
        txf_phone.setText("");
        txf_surname.setText("");
        txf_tc.setText("");
        spn_experience.setValue(0);
        cmb_educaiton.setSelectedIndex(0);

    }

    MyList<String, Integer> regexList;

    private boolean fieldControllerAdd() {
        regexList = new MyList<>();
        regexList.add(txf_name.getText(), 0, LangM.correctName);
        regexList.add(txf_surname.getText(), 0, LangM.correctSurname);
        regexList.add(txf_password.getText(), 3, LangM.correctPassword);
        if (!(txf_password.getText().equals(txf_password1.getText()))) {
            JOptionPane.showMessageDialog(rootPane, LangM.notSamePass, LangM.error, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        regexList.add(txf_mail.getText(), 2, LangM.correctMail);
        regexList.add(txf_phone.getText(), 4, LangM.correctPhone);
        regexList.add(txf_tc.getText(), 1, LangM.correctTc);
        return RegexC.fieldController(regexList, btr_male, btr_fmale);
    }

    private void LanPro() {
        lb_name.setText(LangM.name);
        lb_surname.setText(LangM.surname);
        lb_education.setText(LangM.eduStatus);
        lb_mail.setText(LangM.mail);
        lb_password.setText(LangM.password);
        lb_password1.setText(LangM.password);
        lb_phone.setText(LangM.tel);
        lb_tc.setText(LangM.tc);
        lb_gender.setText(LangM.gender);
        lb_experience.setText(LangM.workExper);
        lb_about.setText(LangM.about);

        btr_male.setText(LangM.male);
        btr_fmale.setText(LangM.fmale);
        bt_save.setText(LangM.sendToAdmin);

        txf_name.setA_textT(LangM.hName);
        txf_surname.setA_textT(LangM.hSurname);
        txf_password.setA_textT(LangM.hPassword);
        txf_password1.setA_textT(LangM.hPasswordAgain);
        txf_mail.setA_textT(LangM.hMail);
        txf_phone.setA_textT(LangM.hTel);
        txf_tc.setA_textT(LangM.hTc);

    }

    /**
     * @param args the command line arguments
     */
    /*
     * public static void main(String args[]) {
     * Setting.startingSetting();
     * java.awt.EventQueue.invokeLater(new Runnable() {
     * public void run() {
     * new SingUpP().setVisible(true);
     * }
     * });
     * }
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup StrtEnd;
    private view.buttons.ButtonN bt_save;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_educaiton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_about;
    private javax.swing.JLabel lb_education;
    private javax.swing.JLabel lb_experience;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_mail;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_password1;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private javax.swing.ButtonGroup search;
    private javax.swing.JSpinner spn_experience;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_mail;
    private view.TextField.TextFeild txf_name;
    private view.TextField.TextFeild txf_password;
    private view.TextField.TextFeild txf_password1;
    private view.TextField.TextFeild txf_phone;
    private view.TextField.TextFeild txf_surname;
    private view.TextField.TextFeild txf_tc;
    // End of variables declaration//GEN-END:variables
}
/*
 * private boolean fieldController() {
 * if (!RegexC.textPatern(txf_name.getText(), LangM.correctName)) {
 * return false;
 * }
 * if (!RegexC.textPatern(txf_surname.getText(), LangM.correctSurname)) {
 * return false;
 * }
 * if (!RegexC.passwordPatern(txf_password.getText(), LangM.correctPassword)) {
 * return false;
 * }
 * if (!RegexC.mailPatern(txf_mail.getText(), LangM.correctMail)) {
 * return false;
 * }
 * if (!RegexC.numberPatern(txf_tc.getText(), 11, LangM.correctTc)) {
 * return false;
 * }
 * if (!RegexC.phonePatern(txf_phone.getText(), LangM.correctPhone)) {
 * return false;
 * }
 * if (!btr_fmale.isSelected() && !btr_male.isSelected()) {
 * System.out.println("hatalı");
 * 
 * return false;
 * }
 * System.out.println("başarılı");
 * 
 * return true;
 * }
 */