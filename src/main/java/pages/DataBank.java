//Bisimillahirrahmanirrahim
package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import constants.models.ListModels;
import functions.PageP;
import langs.LangM;
import langs.tr_Tr;
import regex.RegexC;
import sql.DbHelper;
import sql.Personel;

public class DataBank extends javax.swing.JFrame {

    DbHelper db = new DbHelper();

    public DataBank() {
        tr_Tr.name();
        initComponents();
        ListModels.tblModel(tbl_dataa);
        db.fillTable("info");
        imageP();
        LanPro();
    }

    private void imageP() {
        svg_search.scale();
        lb_perValue.setText(LangM.percent + sld_percent.getValue() + "% " + LangM.show);
        clearFields();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        StrtEnd = new javax.swing.ButtonGroup();
        search = new javax.swing.ButtonGroup();
        pnl_adding = new javax.swing.JPanel();
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
        svg_search = new view.image.SvgImage();
        txf_search = new view.TextField.TextFeild();
        bt_update = new view.buttons.ButtonN();
        bt_sil = new view.buttons.ButtonN();
        bt_add = new view.buttons.ButtonN();
        pnl_filters = new javax.swing.JPanel();
        btr_startSort = new javax.swing.JRadioButton();
        btr_endSort = new javax.swing.JRadioButton();
        sld_percent = new javax.swing.JSlider();
        lb_perValue = new javax.swing.JLabel();
        pnl_sort = new javax.swing.JPanel();
        chkb_tc = new javax.swing.JCheckBox();
        chk_id = new javax.swing.JCheckBox();
        chk_name = new javax.swing.JCheckBox();
        chk_salary = new javax.swing.JCheckBox();
        spn_experience = new javax.swing.JSpinner();
        clan_startToWork = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_dataa = new javax.swing.JTable();
        pnl_searcFilter = new javax.swing.JPanel();
        chk_tcS = new javax.swing.JCheckBox();
        chk_nameS = new javax.swing.JCheckBox();
        chk_surnameS = new javax.swing.JCheckBox();
        chk_strartWorkS = new javax.swing.JCheckBox();
        chk_mailS = new javax.swing.JCheckBox();
        chk_passwordS = new javax.swing.JCheckBox();
        btr_include = new javax.swing.JRadioButton();
        btr_startS = new javax.swing.JRadioButton();
        btr_endS = new javax.swing.JRadioButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(1350, 800));
        setPreferredSize(new java.awt.Dimension(1350, 800));

        pnl_adding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setText("İsim");
        pnl_adding.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txf_surname.setText("textFeild1");
        pnl_adding.add(txf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 123, 35));

        lb_surname.setText("Soyisim");
        pnl_adding.add(lb_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txf_mail.setText("textFeild1");
        pnl_adding.add(txf_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 123, 35));

        lb_mail.setText("Mail");
        pnl_adding.add(lb_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        lb_salary.setText("Maaş");
        pnl_adding.add(lb_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txf_phone.setText("textFeild1");
        pnl_adding.add(txf_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 123, 35));

        lb_phone.setText("Telofon");
        pnl_adding.add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lb_gender.setText("Cinsiyet");
        pnl_adding.add(lb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        txf_salary.setText("2131223");
        pnl_adding.add(txf_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 123, 35));

        lb_startToWork.setText("Başlama Tarihi");
        pnl_adding.add(lb_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        txf_tc.setText("textFeild1");
        pnl_adding.add(txf_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 123, 35));

        lb_tc.setText("Kimlik Numarası");
        pnl_adding.add(lb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        lb_experience.setText("Çalışma Tecrübesi");
        pnl_adding.add(lb_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        lb_education.setText("Eğitim Durumu");
        pnl_adding.add(lb_education, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        pnl_adding.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 530, 210));

        txf_name.setText("textFeild1");
        pnl_adding.add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 123, 35));

        lb_about.setText("Hakkında");
        pnl_adding.add(lb_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        lb_password.setText("Parola");
        pnl_adding.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        txf_password.setText("textFeild1");
        pnl_adding.add(txf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 123, 35));

        txf_id.setText("textFeild1");
        txf_id.setEnabled(false);
        pnl_adding.add(txf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 123, 35));

        lb_id.setText("İd");
        pnl_adding.add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");
        pnl_adding.add(btr_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");
        pnl_adding.add(btr_fmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));
        pnl_adding.add(cmb_educaiton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        svg_search.setImage("search");
        svg_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                svg_searchMousePressed(evt);
            }
        });
        pnl_adding.add(svg_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 20, 20));

        txf_search.setToolTipText("");
        pnl_adding.add(txf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 460, 50));

        bt_update.setText("Güncelle");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });
        pnl_adding.add(bt_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 100, 40));

        bt_sil.setText("Sil");
        bt_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_silActionPerformed(evt);
            }
        });
        pnl_adding.add(bt_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 40));

        bt_add.setText("Ekle");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        pnl_adding.add(bt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 100, 40));

        pnl_filters.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtreler"));
        pnl_filters.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StrtEnd.add(btr_startSort);
        btr_startSort.setSelected(true);
        btr_startSort.setText("Baştan");
        pnl_filters.add(btr_startSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 17, -1, -1));

        StrtEnd.add(btr_endSort);
        btr_endSort.setText("Sondan");
        pnl_filters.add(btr_endSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 17, -1, -1));

        sld_percent.setValue(100);
        sld_percent.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_percentStateChanged(evt);
            }
        });
        pnl_filters.add(sld_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 188, -1));

        lb_perValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_perValue.setText("100");
        pnl_filters.add(lb_perValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        pnl_sort.setBorder(javax.swing.BorderFactory.createTitledBorder("Sıralama"));
        pnl_sort.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkb_tc.setText("Kimlik No");
        pnl_sort.add(chkb_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        chk_id.setSelected(true);
        chk_id.setText("İd");
        pnl_sort.add(chk_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        chk_name.setText("İsim");
        pnl_sort.add(chk_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        chk_salary.setText("Maaş");
        pnl_sort.add(chk_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        pnl_filters.add(pnl_sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 60));

        pnl_adding.add(pnl_filters, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 340, 120));

        spn_experience.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        pnl_adding.add(spn_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, -1));
        pnl_adding.add(clan_startToWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));

        tbl_dataa.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_dataa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_dataaMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_dataa);

        pnl_adding.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1300, 300));

        pnl_searcFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("arama filtreleri"));
        pnl_searcFilter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chk_tcS.setText("Kimlik Numarası");
        pnl_searcFilter.add(chk_tcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        chk_nameS.setText("İsim");
        pnl_searcFilter.add(chk_nameS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        chk_surnameS.setText("Soyisim");
        pnl_searcFilter.add(chk_surnameS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        chk_strartWorkS.setText("Başlama tarihi");
        pnl_searcFilter.add(chk_strartWorkS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        chk_mailS.setText("Mail");
        pnl_searcFilter.add(chk_mailS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        chk_passwordS.setText("Parola");
        pnl_searcFilter.add(chk_passwordS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        search.add(btr_include);
        btr_include.setSelected(true);
        btr_include.setText("içeren");
        pnl_searcFilter.add(btr_include, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        search.add(btr_startS);
        btr_startS.setText("baştan");
        pnl_searcFilter.add(btr_startS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        search.add(btr_endS);
        btr_endS.setText("sondan");
        pnl_searcFilter.add(btr_endS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        pnl_adding.add(pnl_searcFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 340, 120));

        jPanel1.setBackground(new java.awt.Color(234, 234, 105));

        jPanel2.setBackground(new java.awt.Color(255, 169, 111));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273)
                .addComponent(pnl_adding, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(pnl_adding, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_dataaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_dataaMousePressed
        System.out.println("bastı");
        int sR = tbl_dataa.getSelectedRow();
        int id = Integer.parseInt(tbl_dataa.getValueAt(sR, 0).toString());

        Personel p = db.fillObject(id);

        String[] model = ListModels.cmbEduList;
        String edu = p.getEducationStatus();

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(p.getStartingOfWork());
            clan_startToWork.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txf_id.setText(p.getId() + "");
        txf_name.setText(p.getName());
        txf_surname.setText(p.getSurname());
        txf_tc.setText(p.getTc());
        txf_salary.setText(p.getSalary() + "");
        txf_phone.setText(p.getTel());
        txf_mail.setText(p.getMail());
        txf_password.setText(p.getPassword());
        txa_about.setText(p.getAbout());
        System.out.println(p.getGender());

        if (p.getGender().equals("Erkek")) {
            btr_fmale.setSelected(false);
            btr_male.setSelected(true);
        } else {
            btr_male.setSelected(false);
            btr_fmale.setSelected(true);

        }
        spn_experience.setValue(p.getExperiencYear());

        for (int i = 0; i < model.length; i++) {
            // System.out.println(ListModels.cmbEduList[i]);
            if (edu.equals(ListModels.cmbEduList[i])) {
                cmb_educaiton.setSelectedIndex(i);
            }
        }
    }// GEN-LAST:event_tbl_dataaMousePressed

    // !ara
    private void svg_searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_svg_searchMousePressed
        String search = txf_search.getText();
        String model = "";
        String sortItem = "";
        String catagory = "";
        String start = (btr_startS.isSelected() || btr_include.isSelected()) ? "%" : "";
        String end = (btr_endS.isSelected() || btr_include.isSelected()) ? "%" : "";

        int percent = (int) sld_percent.getValue();

        boolean isIncreasing = btr_startSort.isSelected() ? true : false;
        ArrayList<String> sortList = new ArrayList<>();
        ArrayList<String> catagoryList = new ArrayList<>();

        if (chk_id.isSelected()) {
            sortList.add("id");
        }
        if (chk_name.isSelected()) {
            sortList.add("name");
        }
        if (chk_salary.isSelected()) {
            sortList.add("salary");
        }
        if (chkb_tc.isSelected()) {
            sortList.add("tc");
        }

        for (int i = 0; i < sortList.size(); i++) {
            sortItem += sortList.get(i);
            if (i != sortList.size() - 1) {
                sortItem += " , ";
            }
        }
        if (sortItem.isBlank()) {
            System.out.println("boş");
            sortItem = "id";
        }

        System.out.println(sortItem);

        if (chk_nameS.isSelected()) {
            catagoryList.add("name");
        }
        if (chk_tcS.isSelected()) {
            catagoryList.add("tc");
        }
        if (chk_surnameS.isSelected()) {
            catagoryList.add("surname");
        }
        if (chk_strartWorkS.isSelected()) {
            catagoryList.add("startingOfWork");
        }
        if (chk_mailS.isSelected()) {
            catagoryList.add("mail");
        }
        if (chk_passwordS.isSelected()) {
            catagoryList.add("password");
        }

        for (int i = 0; i < catagoryList.size(); i++) {
            catagory += catagoryList.get(i) + " like '" + end + "" + search + "" + start + "'";

            if (i != catagoryList.size() - 1) {
                catagory += " or ";

            }
        }
        System.out.println("sort item" + sortItem);

        if (!catagory.isBlank()) {

            db.searchData2("info", catagory, sortItem, percent, isIncreasing);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen alanları arama filtresini seçiniz", "hata",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_svg_searchMousePressed

    // !ekle
    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_addActionPerformed
        if (fieldController()) {
            try {
                db.addData(objectPro(), "info");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen alanları uygun şekilde doludurunuz", "hata",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            db.fillTable("info");
            clearFields();
        }
    }// GEN-LAST:event_bt_addActionPerformed

    // !yüzde değiştir
    private void sld_percentStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_sld_percentStateChanged
        lb_perValue.setText("Yüzde " + sld_percent.getValue() + "% göster");
    }// GEN-LAST:event_sld_percentStateChanged

    // !sil
    private void bt_silActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_silActionPerformed
        int id;
        if (tbl_dataa.getSelectedRow() > -1) {
            id = (int) tbl_dataa.getValueAt(tbl_dataa.getSelectedRow(), 0);
            int[] ids = tbl_dataa.getSelectedRows();
            System.out.println(ids.length);

            for (int i = 0; i < ids.length; i++) {
                System.out.println(ids[i] + " silindi");
                id = (int) tbl_dataa.getValueAt(ids[i], 0);
                db.deleteData(id);
            }
        }
        db.fillTable("info");
        clearFields();
    }// GEN-LAST:event_bt_silActionPerformed

    // !güncelleme
    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_updateActionPerformed
        int id;
        if (tbl_dataa.getSelectedRow() > -1 && fieldController()) {
            id = (int) tbl_dataa.getValueAt(tbl_dataa.getSelectedRow(), 0);
            try {
                System.out.println("ekleme alanı");
                db.updateData(id, objectPro());
                db.fillTable("info");
                clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen alanları uygun şekilde doludurunuz", "hata",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());

            }
        }

    }// GEN-LAST:event_bt_updateActionPerformed

    private Personel objectPro() throws Exception {
        String gender = "";
        if (btr_male.isSelected()) {
            gender = "Erkek";
        } else {
            gender = "Kadın";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(clan_startToWork.getDate());
        return new Personel(txf_name.getText(),
                txf_surname.getText(), txf_password.getText(), txf_mail.getText(),
                Integer.parseInt(txf_salary.getText()), txf_phone.getText(),
                gender, date, txf_tc.getText(),
                Integer.parseInt(spn_experience.getValue().toString()),
                cmb_educaiton.getSelectedItem().toString(), txa_about.getText());
    }

    private void clearFields() {
        txa_about.setText("");
        txf_mail.setText("");
        txf_name.setText("");
        txf_password.setText("");
        txf_phone.setText("");
        txf_salary.setText("");
        txf_surname.setText("");
        txf_tc.setText("");
        txf_id.setText("");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-01");
            clan_startToWork.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        spn_experience.setValue(0);
        cmb_educaiton.setSelectedIndex(0);

    }

    private boolean fieldController() {
        if (!RegexC.textPatern(txf_name.getText(), LangM.correctName)) {
            return false;
        }
        if (!RegexC.textPatern(txf_surname.getText(), LangM.correctSurname)) {
            return false;
        }
        if (!RegexC.passwordPatern(txf_password.getText(), LangM.correctPassword)) {
            return false;
        }
        if (!RegexC.mailPatern(txf_mail.getText(), LangM.correctMail)) {
            return false;
        }
        if (!RegexC.numberPatern(txf_salary.getText(), 4, LangM.correctSalary)) {
            return false;
        }
        if (!RegexC.numberPatern(txf_tc.getText(), 11, LangM.correctTc)) {
            return false;
        }
        if (!RegexC.phonePatern(txf_phone.getText(), LangM.correctPhone)) {
            return false;
        }
        if (!btr_fmale.isSelected() && !btr_male.isSelected()) {
            System.out.println("hatalı");

            return false;
        }
        System.out.println("başarılı");

        return true;
    }

    private void LanPro() {
        lb_name.setText(LangM.name);
        lb_surname.setText(LangM.surname);
        lb_id.setText(LangM.id);
        lb_salary.setText(LangM.salary);
        lb_education.setText(LangM.eduStatus);
        lb_mail.setText(LangM.mail);
        lb_password.setText(LangM.password);
        lb_phone.setText(LangM.tel);
        lb_tc.setText(LangM.tc);
        lb_startToWork.setText(LangM.startDate);
        lb_gender.setText(LangM.gender);
        lb_experience.setText(LangM.workExper);
        lb_about.setText(LangM.about);

        bt_update.setText(LangM.update);
        bt_sil.setText(LangM.delete);
        bt_add.setText(LangM.add);

        btr_male.setText(LangM.male);
        btr_fmale.setText(LangM.fmale);
        btr_startSort.setText(LangM.increasing);
        btr_endSort.setText(LangM.decreasing);
        btr_include.setText(LangM.include);
        btr_startS.setText(LangM.perWord);
        btr_endS.setText(LangM.endWord);

        pnl_filters.setBorder(new TitledBorder(LangM.filter));
        pnl_sort.setBorder(new TitledBorder(LangM.sort));
        pnl_searcFilter.setBorder(new TitledBorder(LangM.searchFilter));

        chk_id.setText(LangM.id);
        chk_name.setText(LangM.name);
        chk_salary.setText(LangM.surname);
        chkb_tc.setText(LangM.tc);
        chk_nameS.setText(LangM.name);
        chk_surnameS.setText(LangM.surname);
        chk_tcS.setText(LangM.tc);
        chk_mailS.setText(LangM.mail);
        chk_passwordS.setText(LangM.password);
        chk_strartWorkS.setText(LangM.startDate);

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
    private javax.swing.JRadioButton btr_endS;
    private javax.swing.JRadioButton btr_endSort;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_include;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.JRadioButton btr_startS;
    private javax.swing.JRadioButton btr_startSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_id;
    private javax.swing.JCheckBox chk_mailS;
    private javax.swing.JCheckBox chk_name;
    private javax.swing.JCheckBox chk_nameS;
    private javax.swing.JCheckBox chk_passwordS;
    private javax.swing.JCheckBox chk_salary;
    private javax.swing.JCheckBox chk_strartWorkS;
    private javax.swing.JCheckBox chk_surnameS;
    private javax.swing.JCheckBox chk_tcS;
    private javax.swing.JCheckBox chkb_tc;
    private com.toedter.calendar.JDateChooser clan_startToWork;
    private javax.swing.JComboBox<String> cmb_educaiton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
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
    private javax.swing.JPanel pnl_adding;
    private javax.swing.JPanel pnl_filters;
    private javax.swing.JPanel pnl_searcFilter;
    private javax.swing.JPanel pnl_sort;
    private javax.swing.ButtonGroup search;
    private javax.swing.JSlider sld_percent;
    private javax.swing.JSpinner spn_experience;
    private view.image.SvgImage svg_search;
    private javax.swing.JTable tbl_dataa;
    private javax.swing.JTextArea txa_about;
    private view.TextField.TextFeild txf_id;
    private view.TextField.TextFeild txf_mail;
    private view.TextField.TextFeild txf_name;
    private view.TextField.TextFeild txf_password;
    private view.TextField.TextFeild txf_phone;
    private view.TextField.TextFeild txf_salary;
    private view.TextField.TextFeild txf_search;
    private view.TextField.TextFeild txf_surname;
    private view.TextField.TextFeild txf_tc;
    // End of variables declaration//GEN-END:variables
}
/*
 * if (btr_startSort.isSelected()) {
 * System.out.println("katogoriler" + catagory);
 * 
 * model = "SELECT  * from info where " + catagory + " ORDER BY " + sortItem +
 * " LIMIT "
 * + percent;
 * System.out.println(model);
 * 
 * System.out.println("sql");
 * 
 * } else {
 * model = "SELECT  * from info where " + catagory + " ORDER BY " + sortItem +
 * " desc LIMIT "
 * + percent;
 * }
 */
// db.searchData(model);