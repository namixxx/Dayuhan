/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Zyron
 */
import javax.swing.*;

public class MainClass {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Main Window");

    // Create a ReusablePanel instance
    ReusablePanel panel = new ReusablePanel();

    // Add the panel to the frame (or another JPanel)
    frame.getContentPane().add(panel);
    frame.setLocationRelativeTo(null);
    // Configure frame properties
    frame.pack();
    frame.setVisible(true);
  }
}

