package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanUpgrade extends JPanel {

    public static JButton btnUpgrade1, btnUpgrade2, btnUpgrade3, btnUpgrade4;
    ActionListener upgrade1, upgrade2, upgrade3, upgrade4;
    public static int up1, up2, up3, up4, cost1, cost2, cost3, cost4;

    public PanUpgrade() {
        setLayout(new GridLayout(2, 2));

        up1 = 0;
        up2 = 0;
        up3 = 0;
        up4 = 0;
        cost1 = 100;
        cost2 = 500;
        cost3 = 1000;
        cost4 = 5000;

        btnUpgrade1 = new JButton("Secretly fund Al-Queda - " + "+1/Click - $" + cost1);
        btnUpgrade2 = new JButton("Hire demolition team/ middle eastern looking agents - " + "+5/Click - $" + cost2);
        btnUpgrade3 = new JButton("Rig the WTC's with thermite/ Insert 'Terrorists' - " + "+10/Click - $1000");
        btnUpgrade4 = new JButton("Fund Fox News Coverage - " + "+50/Click - $5000");

        upgrade1 = new Upgrade1();
        upgrade2 = new Upgrade2();
        upgrade3 = new Upgrade3();
        upgrade4 = new Upgrade4();

        btnUpgrade1.addActionListener(upgrade1);
        btnUpgrade2.addActionListener(upgrade2);
        btnUpgrade3.addActionListener(upgrade3);
        btnUpgrade4.addActionListener(upgrade4);

        add(btnUpgrade1);
        add(btnUpgrade2);
        add(btnUpgrade3);
        add(btnUpgrade4);
    }

    class Upgrade1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= cost1) {
                PanClick.cash -= cost1;
                up1++;
                cost1 *= 1.5;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (up1 + up2 + up3 + up4 + 1) + " / click");
                btnUpgrade1.setText("Secretly fund Al-Queda - " + "+1/Click - $" + cost1);
            } else {
                btnUpgrade1.setText("Secretly fund Al-Queda - " + "+1/Click - $" + cost1 + " Insufficient Funds");
            }
        }
    }

    class Upgrade2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= cost2) {
                PanClick.cash -= cost2;
                up2 += 5;
                cost2 *= 1.2;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (up1 + up2 + up3 + up4 + 1) + " / click");
                btnUpgrade2.setText("Hire demolition team/ middle eastern looking agents - " + "+5/Click - $" + cost2);
            } else {
                btnUpgrade2.setText("Hire demolition team/ middle eastern looking agents - " + "+5/Click - $" + cost2 + " Insufficient Funds");
            }
        }
    }

    class Upgrade3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= cost3) {
                PanClick.cash -= cost3;
                up3 += 10;
                cost3 *= 1.25;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (up1 + up2 + up3 + up4 + 1) + " / click");
                btnUpgrade3.setText("Rig the WTC's with thermite/ Insert 'Terrorists' - " + "+10/Click - $" + cost3);
            } else {
                btnUpgrade3.setText("Rig the WTC's with thermite/ Insert 'Terrorists' - " + "+10/Click - $" + cost3 + " Insufficient Funds");
            }
        }
    }

    class Upgrade4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= cost4) {
                PanClick.cash -= cost4;
                up4 += 50;
                cost4 *= 1.75;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (up1 + up2 + up3 + up4 + 1) + " / click");
                btnUpgrade4.setText("Fund Fox News Coverage - " + "+50/Click - $" + cost4);
            } else {
                btnUpgrade4.setText("Fund Fox News Coverage - " + "+50/Click - $" + cost4 + " Insufficient Funds");
            }
        }
    }
}