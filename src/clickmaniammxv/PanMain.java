package clickmaniammxv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanMain extends JPanel {

    JButton btnClick = new JButton("Click");
    JLabel lblClicks = new JLabel();
    ActionListener clicked = new Clicked();
    int clickX, clickY;
    public static int clicks; 

    public PanMain() {
        clickX = 125;
        clickY = 75;

        add(new PanCount());
        setLayout(null);

        add(btnClick);
        btnClick.setSize(clickX, clickY);
        btnClick.setLocation(450 - (clickX / 2), 300 - (clickY / 2));
        btnClick.addActionListener(clicked);
    }

    class Clicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            clicks++;
            System.out.println("Clicked " + clicks + " time(s)");
        }
    }
}