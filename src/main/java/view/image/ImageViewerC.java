//Bismillahirrahmanirrahim
package view.image;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Image;

/**
 *
 * @author bismih
 */
public class ImageViewerC extends JLabel {

    private String image = "def";
    public ImageIcon ico;

    public ImageViewerC() {
        super();
        this.setText(" ");
        scale();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        scale();
    }
 

    public void scale() {
        try {
            setPreferredSize(new Dimension(100,100));
            ico = new ImageIcon(getClass().getResource("/resources/icons/def.png"));
            Image picture = (ico).getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
            ico = new ImageIcon(picture);
            setIcon(ico);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    // public void imageGenerate() {
    // ImageIcon ico;
    // if (isIsIcon()) {
    // ico = new ImageIcon("resources/icons/" + image + ".png");
    // } else {
    // ico = new ImageIcon(getClass().getResource("/resources/pictures/" + image +
    // ".png"));
    //
    // }
    // this.setIcon(new ImageIcon(
    // ico.getImage().getScaledInstance(this.getWidth(), this.getHeight(),
    // Image.SCALE_DEFAULT)));
    // }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the ico
     */
    public ImageIcon getIco() {
        return ico;
    }

    /**
     * @param ico the ico to set
     */
    public void setIco(ImageIcon ico) {
        this.ico = ico;
    }

}
