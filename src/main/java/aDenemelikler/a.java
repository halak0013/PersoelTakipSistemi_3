/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aDenemelikler;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.Color;

import java.text.SimpleDateFormat;

import javax.swing.border.TitledBorder;

import langs.LangM;
import langs.tr_Tr;
import pages.DataBank;
import regex.RegexC;
import sql.DbHelper;
import sql.Personel;
import sql.dbHelped2;

/**
 *
 * @author bismih
 */
public class a extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    public a() {
        initComponents();
        revalidate();
        tr_Tr.trLang();
        //DbHelper.getSqlRowCount("status='" + chartList[i] + "'");
        dbHelped2.fillPersonel("info", "", "id", 100, true);
        
        
        
/*         String tex="java.awt.Color[r=255,g=0,b=0]";
        String r="",g="",b="";
        for (int i = 0; i < tex.length(); i++) {
            if(tex.charAt(i)=='r'){
                if(tex.charAt(i+1)!=','){
                    r+=tex.charAt(i+1);
                }
                
            
            
            } 
        }*/

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(708, 418));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.requestFocusInWindow();

    }//GEN-LAST:event_formMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcDarkOrangeIJTheme.setup();
        tr_Tr.trLang();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println(Color.red);
                
                new a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}
