//Bismillahirrahmanirrahim
package view.image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Image;

/**
 *
 * @author bismih
 */
public class ImageViewerC extends JLabel {

    private String image = "def";
    private ImageIcon ico;

    public ImageViewerC() {
        this.setText(" ");
        setSize(new Dimension(100, 100));
    }

    public void scale() {
        try {
            ico = new ImageIcon(getClass().getResource("/resources/icons/def.png"));
            // setSize(new Dimension(10,10));
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
