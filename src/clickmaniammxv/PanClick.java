package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class PanClick extends JPanel {

    JButton btnClick;
    ImageIcon img, img2;
    ActionListener click;
    public static int cash, clicks, totalcash;

    public PanClick() {
        setLayout(new GridLayout(1, 1));

        cash = 0;
        clicks = 0;
        totalcash = 0;

        btnClick = new JButton();

        click = new Click();

        img = new ImageIcon("bush.png");
        img.getImage();
        
        img2 = new ImageIcon("bush2.png");
        img2.getImage();

        btnClick.addActionListener(click);
        btnClick.setBorderPainted(false);
        btnClick.setBorder(null);
        btnClick.setMargin(new Insets(0, 0, 0, 0));
        btnClick.setContentAreaFilled(false);
        btnClick.setIcon(img);
        btnClick.setPressedIcon(img2);

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