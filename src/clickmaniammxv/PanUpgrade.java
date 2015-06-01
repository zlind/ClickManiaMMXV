package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanUpgrade extends JPanel {

    ActionListener upgrade1 = new Upgrade1();
    ActionListener upgrade2 = new Upgrade2();
    ActionListener upgrade3 = new Upgrade3();
    public static JButton btnUpgrade1 = new JButton("+1/Click - $100");
    public static JButton btnUpgrade2 = new JButton("+5/Click - $500");
    public static JButton btnUpgrade3 = new JButton("+10/Click - $1000");
    public static int cash, clicks; 
    public static int Upgrade1 = 0, Upgrade2 = 0, Upgrade3 = 0;
    public static int Cost1 = 100, Cost2 = 500, Cost3 = 1000;

    public PanUpgrade() {
        setLayout(new GridLayout(2, 2));

        add(btnUpgrade1);
        add(btnUpgrade2);
        add(btnUpgrade3);
        btnUpgrade1.addActionListener(upgrade1);
        btnUpgrade2.addActionListener(upgrade2);
        btnUpgrade3.addActionListener(upgrade3);


    }

    class Upgrade1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= Cost1) {
                PanClick.cash -= Cost1;
                Upgrade1++;
                Cost1 *= 1.5;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (Upgrade1 + Upgrade2 + Upgrade3 + 1) + " / click");
                btnUpgrade1.setText("+1/Click - $" + Cost1);

            } else {

                btnUpgrade1.setText("+1/Click - $" + Cost1 + " Insufficient Funds");
            }
        }
    }

    class Upgrade2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= Cost2) {
                PanClick.cash -= Cost2;
                Upgrade2 += 5;
                Cost2 *= 1.5;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (Upgrade1 + Upgrade2 + Upgrade3 + 1) + " / click");
                btnUpgrade2.setText("+5/Click - $" + Cost2);

            } else {

                btnUpgrade2.setText("+5/Click - $" + Cost2 + " Insufficient Funds");
            }
        }
    }

    class Upgrade3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (PanClick.cash >= Cost3) {
                PanClick.cash -= Cost3;
                Upgrade3 += 10;
                Cost3 *= 1.5;
                PanHud.lblCash.setText("$" + PanClick.cash);
                PanHud.lblPerClick.setText("$" + (Upgrade1 + Upgrade2 + Upgrade3 + 1) + " / click");
                btnUpgrade3.setText("+10/Click - $" + Cost3);

            } else {

                btnUpgrade3.setText("+10/Click - $" + Cost3 + " Insufficient Funds");
            }
        }
    }
}