//Zach Lindner

import javax.swing.JOptionPane;

public class e2a {

    public static void main(String[] args) {
        String sName;
        Character ch;

        sName = JOptionPane.showInputDialog("Name:");
        for (int i = 0; i < sName.length(); i++) {
            ch = sName.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("Use letters only");
                break;
            } else if (Character.isLowerCase(ch) && i == 0) {
                System.out.println(Character.toUpperCase(sName.charAt(0)) + sName.substring(1));
            }
        }
    }
}