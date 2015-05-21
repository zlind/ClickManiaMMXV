package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanClick extends JPanel {

    ActionListener click = new Click();
    JButton btnClick = new JButton("Click");
    public static int cash;

    public PanClick() {
        setLayout(new GridLayout(1, 1));

        add(btnClick);
        btnClick.addActionListener(click);
    }

    class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            PanHud.lblCash.setText("$" + cash++);
        }
    }
}
