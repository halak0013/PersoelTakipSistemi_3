//Bisimillahirrahmanirrahim
package view.TextField;

import java.awt.Color;
import javax.swing.JTextField;
import static javax.swing.BorderFactory.createMatteBorder;

public class TextFeild extends JTextField{

    public TextFeild() {
        setBorder(createMatteBorder(0,0,2,0,new Color(0,0,0)));
        setBackground(new Color(0,0,0,0));
    }
    
    
    //setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
}
