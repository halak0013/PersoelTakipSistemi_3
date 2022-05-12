package functions;

import javax.swing.JFrame;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;



public class PageP {
    public static void openPage(JFrame f, String title) {
        if (title.isBlank()) {
            System.out.println("başlıklı");
            f.setTitle(title);
        }
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        System.out.println(f.hashCode());
        
    }
    public static void theme() {
        FlatArcDarkOrangeIJTheme.setup();
    }
}
