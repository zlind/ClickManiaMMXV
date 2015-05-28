package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanStats extends JPanel {
    
    public static JLabel lblClicks, lblCash, lblUpgrade1;
    
    public PanStats() {
        setLayout(new GridLayout(1, 3));
        
        lblClicks = new JLabel("Clicks: 0", JLabel.CENTER);
        lblCash = new JLabel("Total Cash Earned: $0", JLabel.CENTER);
        lblUpgrade1 = new JLabel("# of Upgrade 1: 0");
        
        add(lblClicks);
        add(lblTime);
    }
    
    class Time implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
        }
    }
}
