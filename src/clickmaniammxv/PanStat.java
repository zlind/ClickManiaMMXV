package clickmaniammxv;

import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanStat extends JPanel {

    public static JLabel lblClicks, lblTotalCash, lblTime;
    Timer tmrTime = new Timer();
    int time;

    public PanStat() {
        setLayout(new GridLayout(1, 3));

        time = 0;

        lblClicks = new JLabel("Clicks: 0", JLabel.CENTER);
        lblTotalCash = new JLabel("Total Cash Earned: $0", JLabel.CENTER);
        lblTime = new JLabel("Time Played: " + time + "s", JLabel.CENTER);

        tmrTime.schedule(new Time(), 0, 1000);

        add(lblClicks);
        add(lblTotalCash);
        add(lblTime);
    }

    class Time extends TimerTask {

        @Override
        public void run() {
            time++;
            lblTime.setText("Time Played: " + time + "s");
        }
    }
}