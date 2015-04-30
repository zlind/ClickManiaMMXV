//Zach Lindner

import java.util.Scanner;

public class e2i {

    public static void main(String[] args) {
        String sentence, letter;
        Character ch;
        StringBuilder sb;
        int key, pos;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input a sentence: ");
        sentence = sin.nextLine();
        System.out.println("Input a letter: ");
        letter = sin.next();
        System.out.println("Input a number: ");
        key = sin.nextInt();

        ch = letter.charAt(0);
        sb = new StringBuilder(sentence);

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                sb = sb.deleteCharAt(i);
                pos = ch - 'A' + 1 + key;

                letter = String.valueOf((char) (pos + 'A' - 1)).toLowerCase();

                sb.insert(i, letter);
                sentence = sb.toString();
            }
        }
        System.out.println("\nEncoded Sentence: " + sentence);
    }
}