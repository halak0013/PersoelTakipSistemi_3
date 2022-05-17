package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegexC {
    static String pattern = "";
    static String trCh = "çÇüÜşŞıİöÖ";
    static Pattern p;
    static Matcher m;

    public static boolean add(String text) {
        p = Pattern.compile(pattern);
        m = p.matcher(text);
        if (m.matches()) {
            JOptionPane.showMessageDialog(null, "doğru  " + text);
            return true;
        }
        JOptionPane.showMessageDialog(null, "yanlış  " + text);
        return false;
    }

    public static boolean textPatern(String text) {
        pattern = "[a-zA-Z" + trCh + "]{3,30}";
        return add(text);

    }

    public static boolean numberPatern(String text) {
        pattern = "[0-9]{1,}";
        return add(text);
    }

    public static boolean mailPatern(String text) {
        pattern = "[a-zA-Z0-9]{3,30}@[a-zA-Z]{3,30}.[a-zA-Z]{2,3}";
        return add(text);
    }

    public static boolean passwordPatern(String text) {
        pattern = "[(a-z)(A-Z)]{1,30}";
        return add(text);

    }
}
