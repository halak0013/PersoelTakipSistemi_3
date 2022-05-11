//Bismillahirrahmanirrahim
package view.buttons;

import constants.Constantas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class ButtonN extends JButton {

    private Color colorMain = Constantas.btMainColor();
    private Color colorOver = Constantas.btOverColor();
    private Color colorClick = Constantas.btClickColor();
    private boolean over;
    private short radius = 25;

    public ButtonN() {
        // !!!!!!!!!! bu çok önemli yoksa buton başta renksiz oluyor
        setBackground(colorMain);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // ? fare üzerine geldiğinde olan renk
                setBackground(Color.orange);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // ? mousu bıraktıktan sonraki renk
                setBackground(Color.pink);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // ? basılı tutulduğundaki renk
                setBackground(Color.magenta);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (over) {
                    // ? basıp bıraktıktan sonra üzerinde durduğu sürece olan renk
                    setBackground(Color.CYAN);
                } else {
                    // ? fareye basıp eğer üzerinde bırkamzsak olacak renk
                    setBackground(Color.yellow);
                }
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
        // RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        // ? kenar rengi
        g2.setColor(Color.red);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(g);
    }

    public Color getColorMain() {
        return colorMain;
    }

    public void setColorMain(Color colorMain) {
        this.colorMain = colorMain;
    }

    /**
     * @return the colorOver
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * @param colorOver the colorOver to set
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * @return the colorClick
     */
    public Color getColorClick() {
        return colorClick;
    }

    /**
     * @param colorClick the colorClick to set
     */
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    /**
     * @return the radius
     */
    public short getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(short radius) {
        this.radius = radius;
    }
}
