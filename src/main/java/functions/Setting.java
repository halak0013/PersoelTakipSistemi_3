package functions;

import java.awt.Color;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;

import langs.en_En;
import langs.tr_Tr;
import sql.dbSetting;

public class Setting {
    public static String theme="darkOrange";
    public static String lang="turkish";
    public static Color color=new Color(250, 164, 1);

    public static String log = "";

    public static void addLog(String logT) {
        log += logT + "\n";
    }

    public static void theme() {
        if (Setting.theme.equals("darkOrange")) {
            FlatArcDarkOrangeIJTheme.setup();
        } else if (Setting.theme.equals("darkBlue")) {
            FlatMaterialDeepOceanIJTheme.setup();
        }
    }

    public static void lang() {
        if (lang.equals("tr")) {
            tr_Tr.trLang();
        } else if (lang.equals("en")) {
            en_En.enLang();
        }
    }

    public static void startingSetting() {
        dbSetting.getData();
        theme();
        lang();
    }

    public static void saveSetting(String theme, String lang) {
        Setting.theme = theme;
        Setting.lang = lang;
        dbSetting.updateData();
        theme();
        lang();
    }
}
