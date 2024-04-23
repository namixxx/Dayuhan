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
import java.awt.*;

public class ReusablePanel extends JPanel {

  // Constructor (you can add parameters to customize the panel)
  public ReusablePanel() {
    // Set preferred size (optional)
    setPreferredSize(new Dimension(500, 500));
    
    // Add components to the panel (buttons, labels, etc.)
    JLabel label = new JLabel("This is a reusable panel!");
    add(label);
  }
}

