package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanStats extends JPanel {

    public static JLabel lblClicks = new JLabel("Clicks: 0", JLabel.CENTER);

    public PanStats() {
        setLayout(new GridLayout(1, 1));

        add(lblClicks);
    }
}
