package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanOption extends JPanel {

    JButton btnSound;
    ActionListener sound;
    boolean bSFX = true;

    public PanOption() {
        setLayout(new GridLayout(1, 1));

        btnSound = new JButton("Sound: On");

        sound = new Sound();

        btnSound.addActionListener(sound);

        add(btnSound);
    }

    class Sound implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (bSFX) {
                btnSound.setText("Sound: Off");
                bSFX = false;
            } else {
                btnSound.setText("Sound: On");
                bSFX = true;
            }
        }
    }
}
