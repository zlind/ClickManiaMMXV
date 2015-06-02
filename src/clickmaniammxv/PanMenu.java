package clickmaniammxv;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanMenu extends JPanel {

    JButton btnUpgrades, btnOptions, btnStats, btnBack;
    ActionListener upgrades = new Upgrades(), options = new Options(), stats = new Stats(), back = new Back();

    public PanMenu() {
        setLayout(new GridLayout(1, 4));
        
        btnUpgrades = new JButton("Upgrades");
        btnOptions = new JButton("Options");
        btnStats = new JButton("Stats");
        btnBack = new JButton("Back");

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
            PanMain.panStats.setVisible(false);
            PanMain.panOptions.setVisible(false);
            PanMain.panUpgrades.setVisible(true);
            FraMain.panMain.add(PanMain.panUpgrades, BorderLayout.CENTER);
        }
    }

    class Options implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
            PanMain.panStats.setVisible(false);
            PanMain.panOptions.setVisible(true);
            PanMain.panUpgrades.setVisible(false);
            FraMain.panMain.add(PanMain.panOptions, BorderLayout.CENTER);
        }
    }

    class Stats implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
            PanMain.panStats.setVisible(true);
            PanMain.panOptions.setVisible(false);
            PanMain.panUpgrades.setVisible(false);
            FraMain.panMain.add(PanMain.panStats, BorderLayout.CENTER);
        }
    }

    class Back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(true);
            PanMain.panStats.setVisible(false);
            PanMain.panUpgrades.setVisible(false);
            PanMain.panOptions.setVisible(false);
        }
    }
}
