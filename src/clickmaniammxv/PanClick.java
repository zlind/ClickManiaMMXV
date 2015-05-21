package clickmaniammxv;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanClick extends JPanel {
    
    ActionListener clicked = new Clicked();
    JButton btnClick = new JButton("Click");

    public PanClick() {
        setLayout(new GridLayout(1, 1));
        
        add(btnClick);
        btnClick.setSize(125, 75);
        //btnClick.addActionListener(clicked);
    }
   class Clicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            clicks++;
            cash++;
            lblCount.setText("Clicks: " + clicks);
            lblCash.setText("$" + cash);
        }
    }
}
