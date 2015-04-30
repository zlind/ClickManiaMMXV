//Zach Lindner

import javax.swing.JOptionPane;

public class e2d {

    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Input Your Name:");
        StringBuilder sb = new StringBuilder(name);
        name = sb.reverse().toString();
        System.out.println(name);
    }
}