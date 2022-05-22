//Bisimillahirrahmanirrahim
package view.TextField;

import java.awt.Color;
import javax.swing.JTextField;

import constants.Constantas;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import static javax.swing.BorderFactory.createMatteBorder;


public class TextFeild extends JTextField {
 private String textT = "lütfen bi değer giriniz";

    public TextFeild() {
        super();
        setBorder(createMatteBorder(0, 0, 2, 0, Constantas.borderColor()));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(Constantas.txNormalColor());
        setText(textT);
        //System.out.println(textT+"ie");

        cursoOn();
        cursoOff();
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent arg0) {
                if (getText().equals(textT)) {
                    setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                    setForeground(Constantas.txNormalColor());
                    setText("");
                    cursoOff();
                }
            }

            @Override
            public void focusLost(FocusEvent arg0) {
                if (getText().length() == 0) {
                    setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 13));
                    setForeground(Constantas.txHintColor());
                    setText(textT);
                    cursoOn();
                }
            }
        });

    }

    private void cursoOff() {
        Font font = getFont().deriveFont(Font.ITALIC);
        setFont(font);
        setForeground(Constantas.hintColor());
    }

    private void cursoOn() {
        Font font = getFont().deriveFont(Font.PLAIN);
        setFont(font);
        setForeground(Constantas.txNormalColor());
    }

    // setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new
    // java.awt.Color(0, 0, 0)));
    /**
     * @return the textT
     */
    public String getTextT() {
        return textT;
    }

    /**
     * @param textT the textT to set
     */
    public void setTextT(String textT) {
        this.textT = textT;
    }

}
