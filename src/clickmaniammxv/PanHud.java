package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanHud extends JPanel {

    public static JLabel lblCash = new JLabel("$0", JLabel.LEFT), 
            lblPerSecond = new JLabel("$0 / second", JLabel.RIGHT);

    public PanHud() {
        setLayout(new GridLayout(1, 2));
    
        add(lblCash);
        add(lblPerSecond);
    }
}
