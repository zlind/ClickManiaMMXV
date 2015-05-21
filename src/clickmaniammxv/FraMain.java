package clickmaniammxv;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        add(new PanMain());
        setTitle("Click Mania MMXV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
