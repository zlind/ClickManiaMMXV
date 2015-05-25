package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanStats extends JPanel {
    
    public static JLabel lblClicks = new JLabel("Clicks: 0", JLabel.CENTER), 
            lblTime = new JLabel("Total time played: 0s", JLabel.CENTER);
    Timer tmrTime;
    ActionListener time = new Time();
    
    public PanStats() {
        tmrTime = new Timer(1, time);
        setLayout(new GridLayout(2, 1));
        
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
