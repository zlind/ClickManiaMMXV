package clickmaniammxv;

import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanStats extends JPanel {

    public static JLabel lblClicks, lblCash, lblTime, lblUpgrade1;
    Timer tmrTime = new Timer();
    int time;

    public PanStats() {
        setLayout(new GridLayout(1, 3));
        
        time = 0;
        
        tmrTime.schedule(new Time(), 0, 1000);

        lblClicks = new JLabel("Clicks: 0", JLabel.CENTER);
        lblCash = new JLabel("Total Cash Earned: $0", JLabel.CENTER);
        lblUpgrade1 = new JLabel("# of Upgrade 1: 0", JLabel.CENTER);
        lblTime = new JLabel("Time Played: " + time + "s", JLabel.CENTER);

        add(lblClicks);
        add(lblCash);
        add(lblUpgrade1);
        add(lblTime);
    }

    class Time extends TimerTask {

        @Override
        public void run() {
            time++;
            lblTime.setText("Time Played: "  + time + "s");
        }
    }
}