//Zach Lindner

import javax.swing.JOptionPane;

public class e2e {

    public static void main(String[] args) {
        String sentence;
        int freq = 0;
        
        sentence = JOptionPane.showInputDialog("Input a Sentence:");
        
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                freq++;
            }
        }
        System.out.println("There are " + (freq + 1) + " words in the sentence");
    }
}