package clickmaniammxv;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanOption extends JPanel {
    public PanOption() {
        setLayout(new GridLayout(1, 10));
        JButton btnSoundOn = new JButton("On"), btnSoundOff = new JButton("Off");
         ActionListener on = new PanOption.On(), off = new PanOption.Off();
        this.setBackground(Color.red);
        add(btnSoundOn);
        add(btnSoundOff);
            btnSoundOn.addActionListener(on);
               btnSoundOff.addActionListener(off);
    }

  class On implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panOption.setVisible(true);
      

        }
    }

    class Off implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanMain.panOption.setVisible(true);

            
        }
    }
}

