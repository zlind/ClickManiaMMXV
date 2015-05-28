package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanUpgrades extends JPanel {

    public static JButton btnUpgrade1 = new JButton("+$1 / Click ~ Cost: $100");
    public static int cost1 = 100, amtUpgrade1 = 0;
    ActionListener upgrade1 = new Upgrade1();

    public PanUpgrades() {
        setLayout(new GridLayout(1, 1));

        add(btnUpgrade1);
        btnUpgrade1.addActionListener(upgrade1);
    }

    class Upgrade1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= cost1) {
                PanClick.cash -= cost1; //deduct cost from cash
                cost1 += 20; //increase cost by $20
                PanUpgrades.btnUpgrade1.setText("+$1 / Click ~ Cost: $" + cost1);
                amtUpgrade1++; //add 1 to total amount of upgrade 1
                PanClick.upgrade++; //add $1 per click
                PanStats.lblUpgrade1.setText("# of Upgrade 1: " + amtUpgrade1); //update amount of upgrades in stats
                PanHud.lblCash.setText("$" + PanClick.cash); //update cash
            }
        }
    }
}
