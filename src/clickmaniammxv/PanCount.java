package clickmaniammxv;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanCount extends JPanel {
    
    JLabel lblCount = new JLabel(PanMain.clicks + " Clicks");
    
    public PanCount() {
        
        setLayout(null);
        
        add(lblCount);
        lblCount.setVisible(true);
        lblCount.setSize(100, 50);
        lblCount.setLocation(5, 5);
    }
}
