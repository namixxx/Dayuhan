/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.AdminDatabaseModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Zyron
 */
public class AdminSignupController {
    private AdminDatabaseModel model;

public AdminSignupController() {
        try {
            this.model = new AdminDatabaseModel(); // Assuming you want to create a new instance here
        } catch (SQLException ex) {
            Logger.getLogger(AdminSignupController.class.getName()).log(Level.SEVERE, null, ex);
        }
}


    public void signUp(String firstName, String lastName, String email, String phoneNumber, String password) {
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "All fields are required");
            return;
        }
        
        try {
            model.signUp(firstName, lastName, email, phoneNumber, password);
            JOptionPane.showMessageDialog(new JFrame(), "Registration successful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Error occurred while registering");
            ex.printStackTrace();
        }
    }
      public boolean login(String email, String password) {
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Email and password are required");
            return false;
        }
        
        try {
            boolean loggedIn = model.login(email, password);
            if (loggedIn) {
//                JOptionPane.showMessageDialog(new JFrame(), "Login successful");
                System.out.println("Login successful!");
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid email or password");
            }
            return loggedIn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Error occurred while logging in");
            ex.printStackTrace();
            return false;
        }
    }
}
