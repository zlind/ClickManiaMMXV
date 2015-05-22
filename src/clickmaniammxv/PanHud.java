package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanHud extends JPanel {

    public static JLabel lblCash = new JLabel("$0"), lblPerSecond = new JLabel("$0 / second");

    public PanHud() {
        setLayout(new GridLayout(1, 2));
    
        add(lblCash);
        add(lblPerSecond);
        
        lblCash.setHorizontalAlignment(JLabel.LEFT);
        lblPerSecond.setHorizontalAlignment(JLabel.RIGHT);
    }
}
