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

public class ContainerPanel extends JPanel {

  public ContainerPanel() {
    // Create a ReusablePanel instance
    ReusablePanel panel = new ReusablePanel();

    // Add the ReusablePanel to this container panel
    add(panel);

    // (Optional) Set layout manager for ContainerPanel
    // This helps position the ReusablePanel within this panel
    // You can choose a layout like BorderLayout, FlowLayout, etc.
    setLayout(new BorderLayout());
    add(panel, BorderLayout.CENTER); // Place the panel in the center
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Container Window");

    // Create a ContainerPanel instance
    ContainerPanel containerPanel = new ContainerPanel();

    // Add the ContainerPanel (containing ReusablePanel) to the frame
    frame.getContentPane().add(containerPanel);

    // Configure frame properties
    frame.pack();
    frame.setVisible(true);
  }
}

