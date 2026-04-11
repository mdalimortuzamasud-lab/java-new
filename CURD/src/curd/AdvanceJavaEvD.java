package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaEvD {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        String createSql = "insert into student (name,email,fee)values(?,?,?)";
        String selectSql = "select*from student";
        String deleteSql = "delete from student Where id=?";
        String UpdateSql = "update student set name=?,email=?,fee=?where id=?";

        createStudent("Budrul", "Budrul@gmail.com", 2000.00f);
        createStudent("tanvit", "tanvir@gmail.com", 3000.00f);
        createStudent("imon", "imon@gmail.com", 4000.00f);

        ShowallStudent();
        System.out.println("--------------------------------------------------------");
        deletestuent(4);
        deletestuent(3);
        ShowallStudent();
        System.out.println("---------------------------------------------------------");
        updateStudent("Emon", "Budrul@gmail.com", 2000.00f, 2);
        ShowallStudent();
        System.out.println("---------------------------------------------------------");
        deletestuent(10);
    }

    public static Connection getCon() {
        String url = "jdbc:mysql://Localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return con;
    }

    public static void createStudent(String name, String email, float fee) {
        String createSql = "insert into student (name,email,fee)values(?,?,?)";
        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Date Saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Data not Saved");
        }

    }

    public static void ShowallStudent() {
        String selectSql = "select*from student";
        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String student = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") + " " + rs.getFloat("fee");

                System.out.println(student);

            }
            rs.close();
            ps.close();
            getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deletestuent(int id) {
        String deleteSql = "delete from student Where id=?";
        try {
            ps = getCon().prepareStatement(deleteSql);
            ps.setInt(1, id);
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("student id " + id + " deleted");
            } else {
                System.err.println("Student data not Deleted");
            }
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateStudent(String name, String email, float fee, int id) {
        String UpdateSql = "update student set name=?,email=?,fee=?where id=?";
        try {
            ps = getCon().prepareStatement(UpdateSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Date updated");
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvD.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Data not updated");
        }
    }
}
