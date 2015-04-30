
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {

    public static JFrame frame = new JFrame("Traxx 2.0");
    public static JPanel panel = new JPanel();
    public static JLabel label = new JLabel("Traxx 2.0", JLabel.CENTER);
    public static JButton button = new JButton("Start Game");
   
    public Frame() {

        //Frame Properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.setSize(900, 700);
        frame.setResizable(false);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        //Panel Properties
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.add(label);
        panel.add(button);
        panel.setBackground(new Color(0xFFFFFF));

        //Label
        label.setSize(285, 30);
        label.setLocation((frame.getWidth() / 2) - 140, 50);

        //Button
        button.setSize(100, 30);
        button.setLocation((frame.getWidth() / 2) - 45, (frame.getHeight() / 2) - 225);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start");
                button.setVisible(false);
                label.setVisible(false);
            }
        });
    }
}
