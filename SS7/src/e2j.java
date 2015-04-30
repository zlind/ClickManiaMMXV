//Zach Lindner

import javax.swing.JOptionPane;

public class e2j {

    public static void main(String[] args) {

        String sentence, split[];
        StringBuilder sb;
        sentence = JOptionPane.showInputDialog("Sentence:");
        
        split = sentence.split(" ");
        sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb = new StringBuilder(split[i]);
            sb.insert(i + 1, "ay");
        }
        sentence = sb.toString();
        System.out.println(sentence);
    }
}