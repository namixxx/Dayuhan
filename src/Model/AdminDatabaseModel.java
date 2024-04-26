/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Zyron
 */
public class AdminDatabaseModel {
        private Connection con;
    private static final String DB_NAME = "dayuhanzy";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3308/" + DB_NAME;
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    public AdminDatabaseModel() throws SQLException {
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (con != null) {
                System.out.println("Connection Successful");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void createTable() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS admindb ("
                     + "id INT AUTO_INCREMENT PRIMARY KEY,"
                     + "first_name VARCHAR(255),"
                     + "last_name VARCHAR(255),"
                     + "email VARCHAR(255),"
                     + "phone_number VARCHAR(20),"
                     + "password VARCHAR(255)"
                     + ")";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.executeUpdate();
        }
    }

    public void signUp(String firstName, String lastName, String email, String phoneNumber, String password) throws SQLException {
        String query = "INSERT INTO admindb (first_name, last_name, email, phone_number, password) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setString(4, phoneNumber);
            stmt.setString(5, password);
            stmt.executeUpdate();
        }
    }
    public boolean login(String email, String password) throws SQLException {
        String query = "SELECT * FROM admindb WHERE email = ? AND password = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Return true if the result set is not empty
        }
    }
}
