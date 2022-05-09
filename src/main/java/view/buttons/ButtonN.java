//Bismillahirrahmanirrahim
package view.buttons;

import constants.Constantas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class ButtonN extends JButton{
    
    private Color colorMain= Constantas.btMainColor();

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setBackground(getColorMain());
    }

    public Color getColorMain() {
        return colorMain;
    }

    public void setColorMain(Color colorMain) {
        this.colorMain = colorMain;
    }
}
