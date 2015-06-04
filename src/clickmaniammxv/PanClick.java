package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanClick extends JPanel {
    
    JButton btnClick;
    ActionListener click;
    public static int cash, clicks, totalcash;
    
    public PanClick() {
        setLayout(new GridLayout(1, 1));
        
        cash = 0;
        clicks = 0;
        totalcash = 0;
        
        btnClick = new JButton("Click");
        
        click = new Click();
        
        btnClick.addActionListener(click);
        
        add(btnClick);
    }
    
    class Click implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent event) {
            cash++;
            clicks++;
            totalcash++;
            
            cash += PanUpgrade.up1;
            cash += PanUpgrade.up2;
            cash += PanUpgrade.up3;
            cash += PanUpgrade.up4;
            
            PanHud.lblCash.setText("$" + cash);
            PanStat.lblClicks.setText("Clicks: " + clicks);
            PanStat.lblTotalCash.setText("Total Cash: $" + totalcash);
        }
    }
}