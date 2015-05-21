package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanStats extends JPanel {
    
    JLabel lblCount = new JLabel("Clicks: 0"), lblCash = new JLabel("$0");
    
    public PanStats() {
        setLayout(new GridLayout(2, 1));
        
        add(lblCount);
        lblCount.setSize(1000, 25);
        add(lblCash);
        lblCash.setSize(1000, 25);
    }
}
