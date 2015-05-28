package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanStats extends JPanel {
    
    public static JLabel lblClicks, lblCash, lblUpgrade1;
    
    public PanStats() {
        setLayout(new GridLayout(1, 3));
        
        lblClicks = new JLabel("Clicks: 0", JLabel.CENTER);
        lblCash = new JLabel("Total Cash Earned: $0", JLabel.CENTER);
        lblUpgrade1 = new JLabel("# of Upgrade 1: 0");
        
        add(lblClicks);
        add(lblCash);
        add(lblUpgrade1);
    }
}
