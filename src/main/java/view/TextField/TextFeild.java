//Bisimillahirrahmanirrahim
package view.TextField;

import java.awt.Color;
import javax.swing.JTextField;

import constants.Constantas;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import static javax.swing.BorderFactory.createMatteBorder;
import langs.LangM;

public class TextFeild extends JTextField {
    private String a_textT = LangM.commonHint;
    private boolean work=true;

    public TextFeild() {
        super();
        setBorder(createMatteBorder(0, 0, 2, 0, Constantas.borderColor()));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(Constantas.txNormalColor());


        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent arg0) {
                if (getText().equals(a_textT)) {
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
                    setText(a_textT);
                    cursoOn();
                }
            }
        });
    }

@Override
protected void paintComponent(Graphics arg0) {
    super.paintComponent(arg0);
if(work){
    setText(a_textT);
    work=false;
}
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
     * @return the a_textT
     */
    public String getA_textT() {
        return a_textT;
    }

    /**
     * @param a_textT the a_textT to set
     */
    public void setA_textT(String a_textT) {
        this.a_textT = a_textT;
    }

}
