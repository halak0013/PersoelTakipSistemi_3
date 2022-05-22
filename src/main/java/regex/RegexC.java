package regex;

import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import functions.MyList;

public class RegexC {
    static String pattern = "";
    static String trCh = "çÇüÜşŞıİöÖ";
    static Pattern p;
    static Matcher m;

    public static final short TEXT_P = 0;
    public static final short NUMBER_P = 1;
    public static final short MAIL_P = 2;
    public static final short PASSWORD_P = 3;
    public static final short PHONE_P = 4;

    public static boolean add(String text, String message) {
        p = Pattern.compile(pattern);
        m = p.matcher(text);
        if (!m.matches()) {
            JOptionPane.showMessageDialog(null, message +" "+ text);

            return false;
        }
        System.out.println("doğru" + text);

        return true;
    }

    public static boolean textPatern(String text, String message) {
        pattern = "[a-zA-Z" + trCh + "]{3,30}";
        return add(text, message);

    }

    public static boolean numberPatern(String text, int min, String message) {
        pattern = "[0-9]{" + min + ",}";
        return add(text, message);
    }

    public static boolean mailPatern(String text, String message) {
        pattern = "[a-zA-Z0-9" + trCh + "]{3,30}@[a-zA-Z]{2,30}.[a-zA-Z]{2,3}";
        return add(text, message);
    }

    public static boolean passwordPatern(String text, String message) {
        // ? baştaki (?=.*) bir kural veriyor
        // ? eğer koşulu sağlıyorsa çalışıyor
        // ?sondaki aralık ise grup oluşturmak için kullanıyoz
        pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])[a-zA-Z0-9\\W" + trCh + "]{8,}";
        return add(text, message);
    }

    public static boolean phonePatern(String text, String message) {
        pattern = "[\\d]{3}[\\s|-]?[\\d]{3}[\\s|-]?[\\d]{2}[\\s|-]?[\\d]{2}";
        return add(text, message);

    }

    public static void dene(String str) {
        System.out.println(str);
        phonePatern(str, "hatla");
    }

    public static boolean fieldController(MyList<String, Integer> tex, JRadioButton... rb) {
        boolean result = true;
        //TODO: gelen verlieri direk TextField olarak almayı dene 
        for (int i = 0; i < tex.size(); i++) {
            switch (tex.getS(i)) {
                case 0:
                    result = textPatern(tex.getF(i), tex.getM(i));
                    break;
                case 1:
                    result = numberPatern(tex.getF(i), 4, tex.getM(i));
                    break;
                case 2:
                    result = mailPatern(tex.getF(i), tex.getM(i));
                    break;
                case 3:
                    result = passwordPatern(tex.getF(i), tex.getM(i));
                    break;
                case 4:
                    result = phonePatern(tex.getF(i), tex.getM(i));
                    break;
                default:
                    break;
            }
            if(!result){
            return false;
            }
        }
        if((!rb[0].isSelected() && !rb[1].isSelected())){
            JOptionPane.showMessageDialog(null, "Lütfen cinsiyeti seçiniz");
        return false;
        }
        return result;

    }
}
