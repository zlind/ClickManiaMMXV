//Zach Lindner

import javax.swing.JOptionPane;

public class e2c {

    public static void main(String[] args) {
        String word;
        int length, index, freq;

        word = JOptionPane.showInputDialog("Input a Word:");
        length = word.length();

        freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                freq++;
            }
        }
        System.out.println("Length: " + length);
        System.out.println("Number of e's: " + freq);
        System.out.print("Position of e's: ");

        index = word.indexOf('e');
        while (index >= 0) {
            System.out.print(index + 1 + " ");
            index = word.indexOf('e', index + 1);
        }
        System.out.println();
    }
}