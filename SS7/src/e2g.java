//Zach Lindner

import javax.swing.JOptionPane;

public class e2g {

    public static void main(String[] args) {
        String number;
        Character ch;
        int sum = 0;

        number = JOptionPane.showInputDialog("Number: ");

        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            sum += Integer.parseInt(String.valueOf(ch));
        }

        if (sum % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else {
            System.out.println("The number is not divisible by 3");
        }
    }
}