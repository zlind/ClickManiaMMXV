//Zach Lindner

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ButtonRandomColour {

    public static JFrame frame = new JFrame("Colour Randomizer");
    public static JPanel panel = new JPanel();
    public static JLabel label = new JLabel("Colour Randomizer", JLabel.CENTER);
    public static JButton button = new JButton("Randomize");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonRandomColour().GUI();
            }
        });
    }

    public void GUI() {
        //Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.setSize(300, 125);
        frame.setResizable(false);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        //Panel
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.add(label);
        panel.add(button);

        //Label
        label.setSize(285, 30);
        label.setLocation(5, 5);

        //Button
        button.setSize(100, 30);
        button.setLocation(95, 45);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                Color c = new Color(r.nextInt(0xFFFFFF));
                panel.setBackground(c);
                System.out.println(c.getRed() + " " + c.getGreen() + " " + c.getBlue());
            }
        });
    }
}