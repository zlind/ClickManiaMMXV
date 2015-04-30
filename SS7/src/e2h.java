//Zach Lindner

import javax.swing.JOptionPane;

public class e2h {

    public static void main(String[] args) {
        String word;
        Character ch, vowel[] = {'a', 'e', 'i', 'o', 'u'};

        word = JOptionPane.showInputDialog("Input a Word:");

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (ch == vowel[j]) {
                    word = word.replace(vowel[j].toString(), "");
                }
            }
        }
        System.out.println(word);
    }
}
