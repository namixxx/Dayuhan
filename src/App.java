
import View.Login;

import javax.swing.*;
/**
 *
 * @author Zyron
 */
public class App {
        public static void main(String[] args) {
        // runs in AWT thread
        SwingUtilities.invokeLater(Login::new);
    }
}
