//Zach Lindner

import java.util.Scanner;

public class LZTest7 {

    public static void main(String[] args) {
        String sInput, sWords[];
        boolean bGood;
        int nGood = 0, nBad = 0;
        Scanner sin = new Scanner(System.in);

        System.out.println("Gimme a sentence");
        sInput = sin.nextLine();

        sWords = sInput.split(" ");
        //iterates through each word in the sentence
        for (int i = 0; i < sWords.length; i++) {
            bGood = isGood(sWords, i);
            if (bGood) {
                nGood++;
            } else {
                nBad++;
            }
        }
        System.out.println(nGood + " good words");
        System.out.println(nBad + " bad words");
    }

    public static boolean isGood(String[] sWords, int i) {
        Character ch, chVowel[] = {'a', 'e', 'i', 'o', 'u'};
        //iterates through each letter in sWords
        for (int j = 0; j < sWords[i].length(); j++) {
            ch = sWords[i].charAt(j);
            //checks if ch is a vowel
            for (int k = 0; k < chVowel.length; k++) {
                if (ch == chVowel[k]) {
                    return true;
                }
            }
        }
        return false;
    }
}