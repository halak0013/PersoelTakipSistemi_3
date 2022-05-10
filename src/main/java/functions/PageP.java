package functions;

import javax.swing.JFrame;



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
}
