package clickmaniammxv;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanMenu extends JPanel {

    JButton btnUpgrades, btnOptions, btnStats, btnBack;
    ActionListener upgrades, options, stats, back;

    public PanMenu() {
        setLayout(new GridLayout(1, 4));

        btnUpgrades = new JButton("Upgrades");
        btnOptions = new JButton("Options");
        btnStats = new JButton("Stats");
        btnBack = new JButton("Back");

        upgrades = new Upgrades();
        options = new Options();
        stats = new Stats();
        back = new Back();

        btnUpgrades.addActionListener(upgrades);
        btnOptions.addActionListener(options);
        btnStats.addActionListener(stats);
        btnBack.addActionListener(back);

        add(btnUpgrades);
        add(btnOptions);
        add(btnStats);
        add(btnBack);
    }

    class Upgrades implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
            PanMain.panUpgrade.setVisible(true);
            PanMain.panStat.setVisible(false);
            PanMain.panOption.setVisible(false);

            FraMain.panMain.add(PanMain.panUpgrade, BorderLayout.CENTER);
        }
    }

    class Options implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
            PanMain.panUpgrade.setVisible(false);
            PanMain.panStat.setVisible(false);
            PanMain.panOption.setVisible(true);

            FraMain.panMain.add(PanMain.panOption, BorderLayout.CENTER);
        }
    }

    class Stats implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(false);
            PanMain.panUpgrade.setVisible(false);
            PanMain.panStat.setVisible(true);
            PanMain.panOption.setVisible(false);

            FraMain.panMain.add(PanMain.panStat, BorderLayout.CENTER);
        }
    }

    class Back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panClick.setVisible(true);
            PanMain.panUpgrade.setVisible(false);
            PanMain.panStat.setVisible(false);
            PanMain.panOption.setVisible(false);
        }
    }
}
