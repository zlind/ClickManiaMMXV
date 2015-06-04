package clickmaniammxv;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanMain extends JPanel {

    public static PanMenu panMenu;
    public static PanClick panClick;
    public static PanHud panHud;
    public static PanStat panStat;
    public static PanUpgrade panUpgrade;
    public static PanOption panOption;

    public PanMain() {
        setLayout(new BorderLayout());

        panMenu = new PanMenu();
        panClick = new PanClick();
        panHud = new PanHud();
        panStat = new PanStat();
        panUpgrade = new PanUpgrade();
        panOption = new PanOption();

        add(panClick, BorderLayout.CENTER);
        add(panHud, BorderLayout.NORTH);
        add(panMenu, BorderLayout.SOUTH);
    }
}
