package sql;

import java.sql.SQLException;

import java.awt.Color;
import functions.Setting;

public class dbSetting extends DbHelper {

    public static void getData() {
    String query = "SELECT * FROM setting";

    try {
        con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);
        while (rs.next()) {
            Setting.theme = rs.getString("theme");
            Setting.lang = rs.getString("lang");
            Setting.color = new Color(rs.getInt("red"), rs.getInt("green"), rs.getInt("blue"));
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    }

    public static void updateData() {
    String query="UPDATE setting SET log=?,theme=?,lang=?,red=?,green=?,blue=?";
    try {
        con=getConnection();
        pStm=con.prepareStatement(query);
        pStm.setString(1, Setting.log);
        pStm.setString(2, Setting.theme);
        pStm.setString(3, Setting.lang);
        pStm.setInt(4, Setting.color.getRed());
        pStm.setInt(5, Setting.color.getGreen());
        pStm.setInt(6, Setting.color.getBlue());
        pStm.executeUpdate();
        pStm.close();
        con.close();
    } catch (SQLException e) {
        showError(e);
    }
    }

}
