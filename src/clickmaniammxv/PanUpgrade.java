package clickmaniammxv;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanUpgrade extends JPanel {

    JButton btnUpgrade1 = new JButton(), btnUpgrade2 = new JButton(), btnUpgrade3 = new JButton();

    public PanUpgrade() {
        setLayout(new GridLayout(1, 3));

        add(btnUpgrade1);
        add(btnUpgrade2);
        add(btnUpgrade3);
        
        btnUpgrade1.setText("Upgrade 1");
        btnUpgrade2.setText("Upgrade 2");
        btnUpgrade3.setText("Upgrade 3");
    }
}
