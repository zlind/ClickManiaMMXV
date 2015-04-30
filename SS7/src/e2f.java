//Zach Lindner

import javax.swing.JOptionPane;

public class e2f {

    public static void main(String[] args) {
        String word;
        Character ch, vowel[] = {'a', 'e', 'i', 'o', 'u'};
        int pos = 0;
        boolean done = false;

        word = JOptionPane.showInputDialog("Input a Word:");

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            for (int j = 0; j < 4; j++) {
                if (ch == vowel[j] && !done) {
                    pos++;
                    System.out.println("Vowel " + vowel[j] + " is letter #" + (i + 1));
                    done = true;
                }
            }
        }
    }
}