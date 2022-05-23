//Bisimillahirrahmanirrahim
package pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import com.formdev.flatlaf.json.ParseException;

import constants.models.ListModels;
import functions.MyList;
import functions.PageP;
import langs.LangM;
import langs.tr_Tr;
import regex.RegexC;
import sql.DbHelper;
import sql.Personel;
import view.panels.MenuItems;

public class DataBank extends javax.swing.JFrame {

    DbHelper db = new DbHelper();
    public DataBank() {
        tr_Tr.trLang();
        initComponents();
        startPro();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        StrtEnd = new javax.swing.ButtonGroup();
        search = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        m_item_menu = new view.panels.MenuItems();
        m_item_check = new view.panels.MenuItems();
        m_item_add = new view.panels.MenuItems();
        m_item_setting = new view.panels.MenuItems();
        m_item_chart = new view.panels.MenuItems();
        pnl_recording = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl_setting = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lb_lang = new javax.swing.JLabel();
        btn_choseColor = new javax.swing.JButton();
        textFeild1 = new view.TextField.TextFeild();
        buttonN1 = new view.buttons.ButtonN();
        bt_seeLog = new view.buttons.ButtonN();
        bt_saveLog = new view.buttons.ButtonN();
        jScrollPane4 = new javax.swing.JScrollPane();
        txa_log = new javax.swing.JTextArea();
        cmb_theme = new javax.swing.JComboBox<>();
        lb_theme = new javax.swing.JLabel();
        pnl_chart = new javax.swing.JPanel();
        pnl_add_check = new javax.swing.JPanel();
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
        spn_experience = new javax.swing.JSpinner();
        clan_startToWork = new com.toedter.calendar.JDateChooser();
        pnl_checkArea = new javax.swing.JPanel();
        lb_candidate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_candidate = new javax.swing.JList<>();
        bt_accept = new view.buttons.ButtonN();
        bt_decline = new view.buttons.ButtonN();
        pnl_searchArea = new javax.swing.JPanel();
        bt_update = new view.buttons.ButtonN();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_dataa = new javax.swing.JTable();
        svg_search = new view.image.SvgImage();
        txf_search = new view.TextField.TextFeild();
        bt_add = new view.buttons.ButtonN();
        bt_sil = new view.buttons.ButtonN();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(99999, 99999));
        setMinimumSize(new java.awt.Dimension(1350, 800));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(220, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(55, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(55, 672));

        m_item_menu.setA_image("menu");
        m_item_menu.setA_text("Main Menu");
        m_item_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_item_menuMousePressed(evt);
            }
        });

        m_item_check.setA_image("check");
        m_item_check.setA_text("Check");
        m_item_check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_item_checkMousePressed(evt);
            }
        });

        m_item_add.setA_image("add");
        m_item_add.setA_text("Add");
        m_item_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_item_addMousePressed(evt);
            }
        });

        m_item_setting.setA_image("setting");
        m_item_setting.setA_text("Setting");
        m_item_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_item_settingMousePressed(evt);
            }
        });

        m_item_chart.setA_image("chart");
        m_item_chart.setA_text("Charts");
        m_item_chart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_item_chartMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m_item_chart, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(m_item_add, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(m_item_check, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(m_item_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(m_item_setting, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(m_item_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_item_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_item_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_item_chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(m_item_setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_setting.setBackground(new java.awt.Color(0, 208, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_lang.setText("Dil");

        btn_choseColor.setText("Kenar rengini seç");

        buttonN1.setText("button");

        bt_seeLog.setText("log kyadını çıkar");

        bt_saveLog.setText("log kaydını bilgsiyara kaydet");

        txa_log.setColumns(20);
        txa_log.setRows(5);
        jScrollPane4.setViewportView(txa_log);

        cmb_theme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_theme.setText("Tema");

        javax.swing.GroupLayout pnl_settingLayout = new javax.swing.GroupLayout(pnl_setting);
        pnl_setting.setLayout(pnl_settingLayout);
        pnl_settingLayout.setHorizontalGroup(
            pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_settingLayout.createSequentialGroup()
                .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(bt_saveLog, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_lang))
                        .addGap(43, 43, 43)
                        .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_settingLayout.createSequentialGroup()
                                .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_theme, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_theme))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_settingLayout.createSequentialGroup()
                                        .addComponent(textFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_settingLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btn_choseColor)))
                                .addGap(23, 23, 23))
                            .addComponent(bt_seeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pnl_settingLayout.setVerticalGroup(
            pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_settingLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addGroup(pnl_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_choseColor))
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addComponent(lb_lang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_settingLayout.createSequentialGroup()
                        .addComponent(lb_theme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_theme, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(bt_seeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_saveLog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnl_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 870, 700));

        pnl_chart.setBackground(new java.awt.Color(241, 171, 59));

        javax.swing.GroupLayout pnl_chartLayout = new javax.swing.GroupLayout(pnl_chart);
        pnl_chart.setLayout(pnl_chartLayout);
        pnl_chartLayout.setHorizontalGroup(
            pnl_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        pnl_chartLayout.setVerticalGroup(
            pnl_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jLayeredPane1.add(pnl_chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 890, 700));

        lb_name.setText("İsim");

        txf_surname.setText("textFeild1");
        txf_surname.setA_textT("");

        lb_surname.setText("Soyisim");

        txf_mail.setText("textFeild1");

        lb_mail.setText("Mail");

        lb_salary.setText("Maaş");

        txf_phone.setText("textFeild1");

        lb_phone.setText("Telofon");

        lb_gender.setText("Cinsiyet");

        txf_salary.setText("2131223");

        lb_startToWork.setText("Başlama Tarihi");

        txf_tc.setText("textFeild1");

        lb_tc.setText("Kimlik Numarası");

        lb_experience.setText("Çalışma Tecrübesi");

        lb_education.setText("Eğitim Durumu");

        jScrollPane2.setToolTipText("");

        txa_about.setColumns(20);
        txa_about.setLineWrap(true);
        txa_about.setRows(5);
        txa_about.setText("lmyli limyemiuylem yilmyim ymyemiym eylmiylm iylmeyl emyilme yimluye lmiuyme ylm iymuyelmuyim yliumy lemyimu\n yelmiy elmyuilm yimu ylmuiy emyiumeyuimyelmiym ymi ymiy lmu iyem yuilme yakielmkalieklmieklm iklkil kei\nieiueiklaşmieş a eikalmkeylak leikalmkieylukalmieklamk lkeahun ıeiuakmieuklmaieamltiuemae klk\neiyam yalielmyşueacsvscövlmkülkpakieie\n lamym eiyla mleiylam \ney aeyi eameymaie yemiaylm iyelma uia uqğplagğmayielmay ylm yeiumae");
        jScrollPane2.setViewportView(txa_about);

        txf_name.setText("textFeild1");

        lb_about.setText("Hakkında");

        lb_password.setText("Parola");

        txf_password.setText("textFeild1");

        txf_id.setText("textFeild1");
        txf_id.setEnabled(false);

        lb_id.setText("İd");

        buttonGroup1.add(btr_male);
        btr_male.setText("Erkek");

        buttonGroup1.add(btr_fmale);
        btr_fmale.setText("Kadın");

        cmb_educaiton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul", "Lise", "Üniversite", "Yüksek Lisans", "Doktora" }));

        spn_experience.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));

        pnl_checkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_candidate.setText("Başvuranlar");
        pnl_checkArea.add(lb_candidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lst_candidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lst_candidateMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lst_candidate);

        pnl_checkArea.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 970, 360));

        bt_accept.setText("Kabul et");
        bt_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acceptActionPerformed(evt);
            }
        });
        pnl_checkArea.add(bt_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 140, 40));

        bt_decline.setText("Reddet");
        bt_decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_declineActionPerformed(evt);
            }
        });
        pnl_checkArea.add(bt_decline, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 140, 40));

        pnl_searchArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_update.setText("Güncelle");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });
        pnl_searchArea.add(bt_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, 40));

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

        pnl_searchArea.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1300, 250));

        svg_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                svg_searchMousePressed(evt);
            }
        });
        pnl_searchArea.add(svg_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 20, 20));

        txf_search.setToolTipText("");
        pnl_searchArea.add(txf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 460, 50));

        bt_add.setText("Ekle");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        pnl_searchArea.add(bt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 40));

        bt_sil.setText("Sil");
        bt_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_silActionPerformed(evt);
            }
        });
        pnl_searchArea.add(bt_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, 40));

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

        pnl_searchArea.add(pnl_searcFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 340, 120));

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

        pnl_searchArea.add(pnl_filters, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 340, 120));

        javax.swing.GroupLayout pnl_add_checkLayout = new javax.swing.GroupLayout(pnl_add_check);
        pnl_add_check.setLayout(pnl_add_checkLayout);
        pnl_add_checkLayout.setHorizontalGroup(
            pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_add_checkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_name)
                                .addComponent(txf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_education)
                                .addComponent(cmb_educaiton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_phone)
                                .addComponent(txf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_surname)
                                .addComponent(txf_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_mail)
                                .addComponent(txf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_startToWork)
                                .addComponent(clan_startToWork, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_id)
                                .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_password)
                                .addComponent(txf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_experience)
                                .addComponent(spn_experience, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_salary)
                                .addComponent(txf_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_tc)
                                .addComponent(txf_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnl_add_checkLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lb_gender))
                                .addGroup(pnl_add_checkLayout.createSequentialGroup()
                                    .addComponent(btr_fmale)
                                    .addGap(19, 19, 19)
                                    .addComponent(btr_male)))
                            .addGap(59, 59, 59)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_about)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(pnl_searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnl_checkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_add_checkLayout.setVerticalGroup(
            pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_add_checkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lb_name)
                            .addGap(1, 1, 1)
                            .addComponent(txf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_education)
                            .addGap(11, 11, 11)
                            .addComponent(cmb_educaiton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(lb_phone)
                            .addGap(11, 11, 11)
                            .addComponent(txf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lb_surname)
                            .addGap(1, 1, 1)
                            .addComponent(txf_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_mail)
                            .addGap(11, 11, 11)
                            .addComponent(txf_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_startToWork)
                            .addGap(11, 11, 11)
                            .addComponent(clan_startToWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lb_id)
                            .addGap(1, 1, 1)
                            .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_password)
                            .addGap(11, 11, 11)
                            .addComponent(txf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_experience)
                            .addGap(11, 11, 11)
                            .addComponent(spn_experience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addComponent(lb_salary)
                            .addGap(11, 11, 11)
                            .addComponent(txf_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_tc)
                            .addGap(11, 11, 11)
                            .addComponent(txf_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(lb_gender)
                            .addGap(21, 21, 21)
                            .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btr_fmale)
                                .addComponent(btr_male)))
                        .addGroup(pnl_add_checkLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lb_about)
                            .addGap(1, 1, 1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addGroup(pnl_add_checkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_searchArea, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnl_checkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl_recordingLayout = new javax.swing.GroupLayout(pnl_recording);
        pnl_recording.setLayout(pnl_recordingLayout);
        pnl_recordingLayout.setHorizontalGroup(
            pnl_recordingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_recordingLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(pnl_add_check, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 128, Short.MAX_VALUE))
        );
        pnl_recordingLayout.setVerticalGroup(
            pnl_recordingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(pnl_recordingLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(pnl_add_check, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(pnl_recording);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void startPro() {
    langProC();
    ListModels.tblModel(tbl_dataa);
    lst_candidate.setModel(ListModels.candidateList);
    db.fillTable("info");
    lb_perValue.setText(LangM.percent + sld_percent.getValue() + "% " + LangM.show);
    clearFieldsAdd();
    pnl_searchArea.setEnabled(false);
    pnl_searchArea.setVisible(false);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMousePressed
        requestFocusInWindow();
    }// GEN-LAST:event_formMousePressed



    private void m_item_checkMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_m_item_checkMousePressed
        gainBt(m_item_check);
        db.fillCandidateList();
        pnl_recording.setVisible(true);
        pnl_checkArea.setVisible(true);
        pnl_searchArea.setVisible(false);
        clearFieldsAdd();
    }// GEN-LAST:event_m_item_checkMousePressed

    private void m_item_menuMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_m_item_menuMousePressed
        PageP.openPage(new MainP(), "");
        dispose();
    }// GEN-LAST:event_m_item_menuMousePressed

    private void m_item_addMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_m_item_addMousePressed
        gainBt(m_item_add);
        pnl_recording.setVisible(true);
        pnl_checkArea.setVisible(false);
        pnl_searchArea.setVisible(true);
        clearFieldsAdd();
    }// GEN-LAST:event_m_item_addMousePressed

    private void m_item_chartMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_m_item_chartMousePressed
        gainBt(m_item_chart);
        pnl_recording.setVisible(false);
        pnl_checkArea.setVisible(false);
        pnl_searchArea.setVisible(false);// TODO chart panelini ekle
    }// GEN-LAST:event_m_item_chartMousePressed

    private void m_item_settingMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_m_item_settingMousePressed
        gainBt(m_item_setting);
    }// GEN-LAST:event_m_item_settingMousePressed

    // ! listeye basıldığında
    private void lst_candidateMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lst_candidateMousePressed
        if (lst_candidate.getSelectedIndex() > -1) {
            String sellectedItem = lst_candidate.getSelectedValue();
            int id = Integer.parseInt(sellectedItem.substring(0, sellectedItem.indexOf('.')));
            fillFields(id, "singUpForms", true);
        }
    }// GEN-LAST:event_lst_candidateMousePressed

    // !kabul etme
    private void bt_acceptActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_acceptActionPerformed
        if (fieldControllerAdd()) {
            try {
                db.addData(objectPro(), "info");
                listClear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen alanları uygun şekilde doludurunuz", "hata",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            db.fillTable("info");
            clearFieldsAdd();
        }
    }// GEN-LAST:event_bt_acceptActionPerformed

    // !reddetme
    private void bt_declineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_declineActionPerformed
        listClear();
    }// GEN-LAST:event_bt_declineActionPerformed

    // !tabloya basıldığında
    private void tbl_dataaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbl_dataaMousePressed
        System.out.println("bastı");
        int sR = tbl_dataa.getSelectedRow();
        int id = Integer.parseInt(tbl_dataa.getValueAt(sR, 0).toString());

        fillFields(id, "info", false);
    }// GEN-LAST:event_tbl_dataaMousePressed

    // !ara
    private void svg_searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_svg_searchMousePressed
        searchProC();
    }// GEN-LAST:event_svg_searchMousePressed

    // !ekle
    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_addActionPerformed
        if (fieldControllerAdd()) {
            try {
                db.addData(objectPro(), "info");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen alanları uygun şekilde doludurunuz", "hata",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            db.fillTable("info");
            clearFieldsAdd();
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
                db.deleteData(id, "info");
            }
        }
        db.fillTable("info");
        clearFieldsAdd();
    }// GEN-LAST:event_bt_silActionPerformed

    // !güncelleme
    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bt_updateActionPerformed
        int id;
        if (tbl_dataa.getSelectedRow() > -1 && fieldControllerAdd()) {
            id = (int) tbl_dataa.getValueAt(tbl_dataa.getSelectedRow(), 0);
            try {
                System.out.println("güncelleme alanı");
                db.updateData(id, objectPro());
                db.fillTable("info");
                clearFieldsAdd();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen alanları uygun şekilde doludurunuz", "hata",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());

            }
        }

    }// GEN-LAST:event_bt_updateActionPerformed



    public  void langProC() {
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

        txf_name.setA_textT(LangM.hName);
        txf_surname.setA_textT(LangM.hSurname);
        txf_password.setA_textT(LangM.hPassword);
        txf_mail.setA_textT(LangM.hMail);
        txf_phone.setA_textT(LangM.hTel);
        txf_tc.setA_textT(LangM.hTc);
        txf_search.setA_textT("");
    }

    public  void searchProC() {
        String search = txf_search.getText();
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
            catagoryList.add("starting_of_work");
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
            JOptionPane.showMessageDialog(null, "Lütfen alanları arama filtresini seçiniz", "hata",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public   Personel objectPro() throws Exception {
        // TODO: cinsiyetleri veri tabanına tek formatta eklemeyi ekle
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

    public  void clearFieldsAdd() {
        txa_about.setText("");
        txf_mail.setText("");
        txf_name.setText("");
        txf_password.setText("");
        txf_phone.setText("");
        txf_surname.setText("");
        txf_tc.setText("");
        txf_id.setText("");
        spn_experience.setValue(0);
        cmb_educaiton.setSelectedIndex(0);
        txf_salary.setText("");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-01");
            clan_startToWork.setDate(date);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }

    public  boolean fieldControllerAdd() {
        MyList<String, Integer> regexList= new MyList<>();
        regexList.add(txf_name.getText(), 0, LangM.correctName);
        regexList.add(txf_surname.getText(), 0, LangM.correctSurname);
        regexList.add(txf_password.getText(), 3, LangM.correctPassword);
        regexList.add(txf_mail.getText(), 2, LangM.correctMail);
        regexList.add(txf_salary.getText(), 1, LangM.correctSalary);
        regexList.add(txf_phone.getText(), 4, LangM.correctPhone);
        regexList.add(txf_tc.getText(), 1, LangM.correctTc);
        return RegexC.fieldController(regexList, btr_male, btr_fmale);
    }

    public  void fillFields(int id, String tableName, boolean isChek) {
        Personel p = db.fillObject(id, tableName, isChek);

        String[] model = ListModels.cmbEduList;
        String edu = p.getEducationStatus();

        if (!isChek) {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(p.getStartingOfWork());
                clan_startToWork.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
            txf_salary.setText(p.getSalary() + "");
        }
        txf_id.setText(p.getId() + "");
        txf_name.setText(p.getName());
        txf_surname.setText(p.getSurname());
        txf_tc.setText(p.getTc());
        txf_phone.setText(p.getTel());
        txf_mail.setText(p.getMail());
        txf_password.setText(p.getPassword());
        txa_about.setText(p.getAbout());

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
    }

    public  void listClear() {
        if (lst_candidate.getSelectedIndex() > -1) {
            String sellectedItem = lst_candidate.getSelectedValue();
            int id = Integer.parseInt(sellectedItem.substring(0, sellectedItem.indexOf('.')));
            db.deleteData(id, "singUpForms");
            ListModels.candidateList.remove(lst_candidate.getSelectedIndex());
            clearFieldsAdd();
        }
    }

    public  void gainBt(MenuItems mi) {
        m_item_add.lostFocus();
        m_item_chart.lostFocus();
        m_item_check.lostFocus();
        m_item_setting.lostFocus();
        mi.gainFocus();
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
    private view.buttons.ButtonN bt_accept;
    private view.buttons.ButtonN bt_add;
    private view.buttons.ButtonN bt_decline;
    private view.buttons.ButtonN bt_saveLog;
    private view.buttons.ButtonN bt_seeLog;
    private view.buttons.ButtonN bt_sil;
    private view.buttons.ButtonN bt_update;
    private javax.swing.JButton btn_choseColor;
    private javax.swing.JRadioButton btr_endS;
    private javax.swing.JRadioButton btr_endSort;
    private javax.swing.JRadioButton btr_fmale;
    private javax.swing.JRadioButton btr_include;
    private javax.swing.JRadioButton btr_male;
    private javax.swing.JRadioButton btr_startS;
    private javax.swing.JRadioButton btr_startSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private view.buttons.ButtonN buttonN1;
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
    private javax.swing.JComboBox<String> cmb_theme;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lb_about;
    private javax.swing.JLabel lb_candidate;
    private javax.swing.JLabel lb_education;
    private javax.swing.JLabel lb_experience;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_lang;
    private javax.swing.JLabel lb_mail;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_perValue;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_salary;
    private javax.swing.JLabel lb_startToWork;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_tc;
    private javax.swing.JLabel lb_theme;
    private javax.swing.JList<String> lst_candidate;
    private view.panels.MenuItems m_item_add;
    private view.panels.MenuItems m_item_chart;
    private view.panels.MenuItems m_item_check;
    private view.panels.MenuItems m_item_menu;
    private view.panels.MenuItems m_item_setting;
    private javax.swing.JPanel pnl_add_check;
    private javax.swing.JPanel pnl_chart;
    private javax.swing.JPanel pnl_checkArea;
    private javax.swing.JPanel pnl_filters;
    private javax.swing.JPanel pnl_recording;
    private javax.swing.JPanel pnl_searcFilter;
    private javax.swing.JPanel pnl_searchArea;
    private javax.swing.JPanel pnl_setting;
    private javax.swing.JPanel pnl_sort;
    private javax.swing.ButtonGroup search;
    private javax.swing.JSlider sld_percent;
    private javax.swing.JSpinner spn_experience;
    private view.image.SvgImage svg_search;
    private javax.swing.JTable tbl_dataa;
    private view.TextField.TextFeild textFeild1;
    private javax.swing.JTextArea txa_about;
    private javax.swing.JTextArea txa_log;
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

/*
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
 * if (!RegexC.numberPatern(txf_salary.getText(), 4, LangM.correctSalary)) {
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
 */