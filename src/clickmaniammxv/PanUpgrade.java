package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanUpgrade extends JPanel {

    ActionListener upgrade1 = new Upgrade1();
    public static JButton btnUpgrade1 = new JButton("+1/Click - $100");
    public static int cash, clicks, Upgrade1 = 0, Cost1 = 100;

    public PanUpgrade() {
        setLayout(new GridLayout(1, 1));

        add(btnUpgrade1);
        btnUpgrade1.addActionListener(upgrade1);


    }

    class Upgrade1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= Cost1) {
                PanClick.cash -= Cost1;
                Upgrade1++;
                Cost1 *= 1.5;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (Upgrade1 + 1) + " / click");
                btnUpgrade1.setText("+1/Click - $" + Cost1 );
   
            } else {
            }
        }
    }
}