package functions;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Image;
public class ImagePro {

    public ImagePro() {
    }

    ///? Icon tanımlarının yapıldığı yer
    public Icon icon_setting(JLabel lb_setting,String img) {
        ImageIcon m_settings= new ImageIcon(getClass().getResource("/resources/icons/"+img+".png"));
        return new ImageIcon(m_settings.getImage().getScaledInstance(lb_setting.getWidth(), lb_setting.getHeight(), Image.SCALE_DEFAULT));
    }
    public Icon picture_setting(JLabel lb_setting,String img) {
        ImageIcon m_settings= new ImageIcon(getClass().getResource("/resources/pictures/"+img+".png"));
        return new ImageIcon(m_settings.getImage().getScaledInstance(lb_setting.getWidth(), lb_setting.getHeight(), Image.SCALE_DEFAULT));
    }
}
