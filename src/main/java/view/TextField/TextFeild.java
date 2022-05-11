//Bisimillahirrahmanirrahim
package view.TextField;

import java.awt.Color;
import javax.swing.JTextField;

import constants.Constantas;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import static javax.swing.BorderFactory.createMatteBorder;

//! kullanırken frame window gainde focus aksiyoun eklemyi unutma
//!!!!!!!!!!!!!!!!!!! Kocaman over ride unutturulursa hal böyle olur

public class TextFeild extends JTextField {
    private String textT = "lütfen bi değer giriniz";

    public TextFeild() {
        setBorder(createMatteBorder(0, 0, 2, 0, Constantas.borderColor()));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(Constantas.txColor());
        textT=getText();
        System.out.println(textT+"ie");
        

cursoOn();
cursoOff();
        addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent arg0) {
            if(getText().equals(textT)){
            setText("");
            //requestFocus();
            cursoOff();
            }
        }
        @Override
            public void focusLost(FocusEvent arg0) {
                if(getText().length()==0){
                setText(textT);
                cursoOn();
                }
            }
        });
    }


private void cursoOff() {
Font font=getFont().deriveFont(Font.ITALIC);
setFont(font);
setForeground(Constantas.hintColor());
}

private void cursoOn() {
    Font font=getFont().deriveFont(Font.PLAIN);
    setFont(font);
    setForeground(Constantas.txColor());
    }

    // setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new
    // java.awt.Color(0, 0, 0)));

//    /**
//     * @return the textT
//     */
//    public String getTextT() {
//        return textT;
//    }
//
//    /**
//     * @param textT the textT to set
//     */
//    public void setTextT(String textT) {
//        this.textT = textT;
//    }


}
