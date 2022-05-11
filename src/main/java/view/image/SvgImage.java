//Bisimillahirrahmanirrahim
package view.image;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.JLabel;

public class SvgImage extends JLabel {

    private FlatSVGIcon svg;
    private String image="close";

    public void scale() {
        try {
            svg = new FlatSVGIcon("resources/icons/"+getImage()+".svg", getWidth(), getHeight());
            setIcon(svg);
        } catch (Exception e) {
            System.out.println("svg error"+e.getMessage());
        }
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
