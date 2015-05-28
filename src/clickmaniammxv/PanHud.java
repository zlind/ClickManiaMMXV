package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanHud extends JPanel {

    public static JLabel lblCash = new JLabel("$0"), lblPerSecond = new JLabel("$0 / second")
            , lblPerClick = new JLabel("$1 / click");

    public PanHud() {
        setLayout(new GridLayout(1, 2));
    
        add(lblCash);
        add(lblPerSecond);
        add(lblPerClick);
        
        
        lblCash.setHorizontalAlignment(JLabel.LEFT);
        lblPerSecond.setHorizontalAlignment(JLabel.RIGHT);
        lblPerClick.setHorizontalAlignment(JLabel.RIGHT);
    }
}
