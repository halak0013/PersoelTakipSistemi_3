package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbHelper {
    private static String dbUrl = "jdbc:sqlite:personel_data.db";
    static Connection con;
    static Statement state;
    static ResultSet rs;
    static PreparedStatement pStm;

    public static Connection getConnection() throws SQLException {
        Personel p1 = new Personel();

        return (Connection) DriverManager.getConnection(dbUrl);
    }

    public static void showError(SQLException e) {
        System.out.println("Error code " + e.getErrorCode());
        System.out.println("Error message " + e.getMessage());
    }

    public static int getMaxId() {
        String query = "SELECT MAX(id) as mId FROM personel";
        int maxId = 0;
        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);

            maxId = rs.getInt("mId");
            con.close();
        } catch (SQLException e) {
            showError(e);
        }
        return maxId;
    }

    public static void deleteData(int id) {
        String query = "DELETE FROM personel where id ="+id;

        try {
            con = DbHelper.getConnection();
            state = con.createStatement();
            rs = state.executeQuery(query);
            state.executeUpdate(query);
            con.close();
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        }

    }

    public static void addData(Personel p) throws SQLException {
        String query = "INSERT INTO personel (id, name, surname, password, mail, salary, tel, gender, starting_of_work, tc, experience_year, education_satus, about) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DbHelper.getConnection();
            pStm = con.prepareStatement(query);

            pStm.setInt(1, p.getId());
            pStm.setString(2, p.getName());
            pStm.setString(3, p.getSurname());
            pStm.setString(4, p.getPassword());
            pStm.setString(5, p.getMail());
            pStm.setInt(6, p.getSalary());
            pStm.setString(7, p.getTel());
            pStm.setString(8, p.getGender());
            pStm.setDate(9, p.getStartingOfWork());
            pStm.setString(10, p.getTc());
            pStm.setInt(11, p.getExperiencYear());
            pStm.setString(12, p.getEducationStatus());
            pStm.setString(13, p.getAbout());
            pStm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarılı bir şekilde eklendi");
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        } finally {
            pStm.close();
            con.close();
        }
    }

    public void updateData(int id, Personel p) {
        String query = "UPDATE personel SET  name   = ?, surname = ?, password = ?, mail = ?, salary = ?, tel = ?, gender= ?, starting_of_work =?,tc=?,experience_year=?, education_satus=?,about=? WHERE id ="+id;
    
        try {
            con = DbHelper.getConnection();
            pStm = con.prepareStatement(query);

            pStm.setInt(1, p.getId());
            pStm.setString(2, p.getName());
            pStm.setString(3, p.getSurname());
            pStm.setString(4, p.getPassword());
            pStm.setString(5, p.getMail());
            pStm.setInt(6, p.getSalary());
            pStm.setString(7, p.getTel());
            pStm.setString(8, p.getGender());
            pStm.setDate(9, p.getStartingOfWork());
            pStm.setString(10, p.getTc());
            pStm.setInt(11, p.getExperiencYear());
            pStm.setString(12, p.getEducationStatus());
            pStm.setString(13, p.getAbout());
            pStm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarılı bir şekilde güncellendi");
            pStm.close();
            con.close();
        } catch (SQLException e) {
            showError(e);
            JOptionPane.showMessageDialog(null, "Hata oluştu");
        }
    }

    

}
