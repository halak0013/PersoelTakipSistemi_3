package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
private static String dbUrl="jdbc:sqlite:personel_data.db";

    public static Connection getConnection() throws SQLException{
        Personel p1=new Personel();
        
        return (Connection)DriverManager.getConnection(dbUrl);
    }

    public static void showError(SQLException e) {
        System.out.println("Error code "+e.getErrorCode());
        System.out.println("Error message "+e.getMessage());
    }

    
}
