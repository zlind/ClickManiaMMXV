package clickmaniammxv;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanMain extends JPanel {

    PanUpgrade panUpgrade = new PanUpgrade();
    PanClick panClick = new PanClick();
    PanStats panStats = new PanStats();
    public static int clicks, cash, multiplier;

    public PanMain() {
        setLayout(new BorderLayout());
        
        add(panUpgrade, BorderLayout.SOUTH);
        add(panClick, BorderLayout.CENTER);
        add(panStats, BorderLayout.NORTH);
    }
}