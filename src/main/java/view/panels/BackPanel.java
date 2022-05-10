//Bisimillahirrahmanirrahim
package view.panels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class BackPanel extends javax.swing.JPanel {
private short radius=33;

    public BackPanel() {
        initComponents();
        
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        //? panelin köşelrini daha yumaşak yapılıyor
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        //? x  y  genişlik  uzunluk    yuvarlık yarıçapı
        g2.fillRoundRect(0, 0,getWidth(),getHeight(), radius, radius);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
