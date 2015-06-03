package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanHud extends JPanel {

    public static JLabel lblCash, lblPerSecond, lblPerClick;

    public PanHud() {
        setLayout(new GridLayout(1, 2));

        lblCash = new JLabel("$0");
        lblPerSecond = new JLabel("$0 / second");
        lblPerClick = new JLabel("$1 / click");

        lblCash.setHorizontalAlignment(JLabel.LEFT);
        lblPerSecond.setHorizontalAlignment(JLabel.CENTER);
        lblPerClick.setHorizontalAlignment(JLabel.RIGHT);

        add(lblCash);
        add(lblPerSecond);
        add(lblPerClick);
    }
}