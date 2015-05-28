package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanClick extends JPanel {

    ActionListener click = new Click();
    JButton btnClick = new JButton("Click");
    public static int cash, clicks, totalcash, upgrade;

    public PanClick() {
        setLayout(new GridLayout(1, 1));

        add(btnClick);
        btnClick.addActionListener(click);
    }

    class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            cash++; //add 1 to cash
            cash+=upgrade; //add x from upgrades
            
            totalcash++; //add 1 to total cash
            totalcash+=upgrade; //add x from upgrades
            
            clicks++; //add 1 to total clicks
            
            PanHud.lblCash.setText("$" + cash); //update cash
            PanStats.lblClicks.setText("Clicks: " + clicks); //update total # of clicks
            PanStats.lblCash.setText("Total Cash Earned: $" + totalcash); //update total cash earned
        }
    }
}
