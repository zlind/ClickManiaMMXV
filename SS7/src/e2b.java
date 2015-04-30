//Zach Lindner

import javax.swing.JOptionPane;

public class e2b {

    public static void main(String[] args) {
        String name;
        Character first, last;
        boolean isName;

        name = JOptionPane.showInputDialog("First + Last Name:");
        String split[] = name.split(" ");
        first = split[0].charAt(0);
        last = split[1].charAt(0);
        isName = isName(name, first, last);

        if (isName == false) {
            first = Character.toUpperCase(first);
            last = Character.toUpperCase(last);
            System.out.println("Fix yo name foo");
        }
        name = first + split[0].substring(1) + " " + last + split[1].substring(1);
        System.out.println(name);
    }

    public static boolean isName(String name, Character first, Character last) {
        if (Character.isLowerCase(first)) {
            return false;
        }
        if (Character.isLowerCase(last)) {
            return false;
        }
        if (Character.isUpperCase(first)) {
            if (Character.isUpperCase(last)) {
                if (name.matches(".*\\d.*")) {
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}