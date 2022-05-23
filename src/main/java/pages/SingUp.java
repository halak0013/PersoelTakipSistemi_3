/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pages;

import functions.PageP;
import functions.Setting;

/**
 *
 * @author bismih
 */
public class SingUp extends javax.swing.JFrame {

    /**
     * Creates new form SingUp
     */
    public SingUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb_experience = new javax.swing.JLabel();
        txf_name = new view.TextField.TextFeild();
        lb_education = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        txf_surname = new view.TextField.TextFeild();
        lb_surname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_about = new javax.swing.JTextArea();
        txf_mail = new view.TextField.TextFeild();
        lb_mail = new javax.swing.JLabel();
        lb_about = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        txf_password = new view.TextField.TextFeild();
        txf_phone = new view.TextField.TextFeild();
        lb_phone = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        txf_tc = new view.TextField.TextFeild();
        lb_tc = new javax.swing.JLabel();
        lb_passwordA = new javax.swing.JLabel();
        txf_passwordA = new view.TextField.TextFeild();
        btr_male = new javax.swing.JRadioButton();
        btr_fmale = new javax.swing.JRadioButton();
        bt_endSaving = new view.buttons.ButtonN();
        spn_experience = new javax.swing.JSpinner();
        cmb_educaiton = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_experience.setText("Çalışma Tecrübesi");
        getContentPane().add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        txf_name.setText("textFeild1");
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 123, 35));

        lb_education.setText("Eğitim Durumu");
        getContentPane().add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        lb_name.setText("İsim");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        txf_surname.setText("textFeild1");
        getContentPane().add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 123, 35));

        lb_surname.setText("Soyisim");
        getContentPane().add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 715, 193));

        txf_mail.setText("textFeild1");
        getContentPane().add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 123, 35));

        lb_mail.setText("Mail");
        getContentPane().add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lb_about.setText("Hakkında");
        getContentPane().add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lb_password.setText("Parola");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        txf_password.setText("textFeild1");
        getContentPane().add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 123, 35));

        txf_phone.setText("textFeild1");
        getContentPane().add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 123, 35));

        lb_phone.setText("Telofon");
        getContentPane().add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        lb_gender.setText("Cinsiyet");
        getContentPane().add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        txf_tc.setText("textFeild1");
        getContentPane().add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        getContentPane().add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        lb_passwordA.setText("Parola Tekrarı");
        getContentPane().add(lb_passwordA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        txf_passwordA.setText("textFeild1");
        getContentPane().add(txf_passwordA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 123, 35));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        getContentPane().add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        getContentPane().add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        bt_endSaving.setText("Kaydı Tamamla");
        bt_endSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_endSavingActionPerformed(evt);
            }
        });
        getContentPane().add(bt_endSaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        spn_experience.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        getContentPane().add(spn_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        getContentPane().add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_endSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_endSavingActionPerformed
        
    }//GEN-LAST:event_bt_endSavingActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Setting.theme();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.buttons.ButtonN bt_endSaving;
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
    private javax.swing.JLabel lb_passwordA;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private javax.swing.JSpinner spn_experience;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_mail;
    private view.TextField.TextFeild txf_name;
    private view.TextField.TextFeild txf_password;
    private view.TextField.TextFeild txf_passwordA;
    private view.TextField.TextFeild txf_phone;
    private view.TextField.TextFeild txf_surname;
    private view.TextField.TextFeild txf_tc;
    // End of variables declaration//GEN-END:variables
}
