package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegexC {
    static String pattern = "";
    static String trCh = "çÇüÜşŞıİöÖ";
    static Pattern p;
    static Matcher m;

    public static boolean add(String text,String message) {
        p = Pattern.compile(pattern);
        m = p.matcher(text);
        if (!m.matches()) {
            JOptionPane.showMessageDialog(null, "doğru  " + text);
            return false;
        }
        System.out.println("doğru"  + text);
        
        return true;
    }

    public static boolean textPatern(String text,String message) {
        pattern = "[a-zA-Z" + trCh + "]{3,30}";
        return add(text,message);

    }

    public static boolean numberPatern(String text,int min,String message) {
        pattern = "[0-9]{"+min+",}";
        return add(text,message);
    }

    public static boolean mailPatern(String text,String message) {
        pattern = "[a-zA-Z0-9"+trCh+"]{3,30}@[a-zA-Z]{2,30}.[a-zA-Z]{2,3}";
        return add(text,message);
    }

    public static boolean passwordPatern(String text,String message) {
        //? baştaki (?=.*) bir kural veriyor
        //? eğer koşulu sağlıyorsa çalışıyor
        //?sondaki aralık ise grup oluşturmak için kullanıyoz
        pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])[a-zA-Z0-9\\W"+trCh+"]{4,}";
        return add(text,message);
    }

    public static boolean phonePatern(String text,String message) {
    pattern="[\\d]{3}[\\s|-]?[\\d]{3}[\\s|-]?[\\d]{2}[\\s|-]?[\\d]{2}";
        return add(text,message);
    }


    public static void dene(String str) {
        System.out.println(str);
        phonePatern(str,"hatla");
    }
}
