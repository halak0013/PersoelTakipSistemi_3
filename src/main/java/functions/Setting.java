package functions;
import java.awt.Color;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
public class Setting {
    public static String theme;
    public static String lang;
    public static Color color;

    public static String log="";
    public static void addLog(String logT) {
    log+=logT+"\n";
    }


    public static void theme() {
        if (Setting.theme.equals("darkOrange")) {
            FlatArcDarkOrangeIJTheme.setup();
        }else if(Setting.theme.equals("darkBlue")){
            FlatArcDarkOrangeIJTheme.setup();
        }
    }
}
