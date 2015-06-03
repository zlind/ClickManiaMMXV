package clickmaniammxv;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanMain extends JPanel {

    public static PanMenu panMenu;
    public static PanClick panClick;
    public static PanHud panHud;
    public static PanStats panStats;
    public static PanUpgrade panUpgrade;

    public PanMain() {
        setLayout(new BorderLayout());

        panMenu = new PanMenu();
        panClick = new PanClick();
        panHud = new PanHud();
        panStats = new PanStats();
        panUpgrade = new PanUpgrade();

        add(panClick, BorderLayout.CENTER);
        add(panHud, BorderLayout.NORTH);
        add(panMenu, BorderLayout.SOUTH);
    }
}
