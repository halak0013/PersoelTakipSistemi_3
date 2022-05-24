package sql;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.awt.Color;
import functions.Setting;
import langs.LangM;

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
        con.close();
    } catch (SQLException e) {
        showError(e);
    }
    }

    public static void updateData() {
    String query="UPDATE setting SET theme=?,lang=?,red=?,green=?,blue=?";
    try {
        con=getConnection();
        pStm=con.prepareStatement(query);
        pStm.setString(1, Setting.theme);
        pStm.setString(2, Setting.lang);
        pStm.setInt(3, Setting.color.getRed());
        pStm.setInt(4, Setting.color.getGreen());
        pStm.setInt(5, Setting.color.getBlue());
        pStm.executeUpdate();
        JOptionPane.showMessageDialog(null, LangM.updatingDone);
        con.close();
    } catch (SQLException e) {
        showError(e);
    }
    }

}
