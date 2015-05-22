package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanMenu extends JPanel {

    JButton btnUpgrades = new JButton("Upgrades"), btnOptions = new JButton("Options"), btnStats = new JButton("Stats"), btnBack = new JButton("Back");
    ActionListener upgrades = new Upgrades(), options = new Options(), stats = new Stats(), back = new Back();

    public PanMenu() {
        setLayout(new GridLayout(1, 4));

        add(btnUpgrades);
        add(btnOptions);
        add(btnStats);
        add(btnBack);

        btnUpgrades.addActionListener(upgrades);
        btnOptions.addActionListener(options);
        btnStats.addActionListener(stats);
        btnBack.addActionListener(back);
    }

    class Upgrades implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
        }
    }

    class Options implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
        }
    }

    class Stats implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
        }
    }

    class Back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(true);
        }
    }
}
