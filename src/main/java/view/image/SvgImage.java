//Bisimillahirrahmanirrahim
package view.image;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;

public class SvgImage extends JLabel {

    private FlatSVGIcon svg;
    private String image="search";

    public SvgImage() {
        super();
        scale();
    }

    public void scale() {
        try {
            setPreferredSize(new Dimension(100,100));
            svg = new FlatSVGIcon("resources/icons/"+getImage()+".svg", getWidth(), getHeight());
            setIcon(svg);
        } catch (Exception e) {
            System.out.println("svg error"+e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        scale();
    }

    /**
     * @return the svg
     */
    public FlatSVGIcon getSvg() {
        return svg;
    }

    /**
     * @param svg the svg to set
     */
    public void setSvg(FlatSVGIcon svg) {
        this.svg = svg;
    }

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

}
