import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class minclose extends javax.swing.JFrame {

    public minclose() {
        initComponents();
        centerWindow();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeWindow();
            }
        });
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Custom Window Controls Demo");
        getContentPane().add(jLabel1);

        minimizeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minimizeButton.setText("-");
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeButton);

        closeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton);

        pack();
    }

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                             
        setState(ICONIFIED);
    }                                            

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        closeWindow();
    }                                         

    private void closeWindow() {
        this.dispose();
    }

    private void centerWindow() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        this.setLocation(x, y);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minclose().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimizeButton;
}
