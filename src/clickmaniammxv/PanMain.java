package clickmaniammxv;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanMain extends JPanel {

    public static PanMenu panMenu = new PanMenu();
    public static PanClick panClick = new PanClick();
    public static PanHud panHud = new PanHud();

    public PanMain() {
        setLayout(new BorderLayout());

        add(panMenu, BorderLayout.SOUTH);
        add(panClick, BorderLayout.CENTER);
        add(panHud, BorderLayout.NORTH);
    }
}
