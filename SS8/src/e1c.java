//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1c {

    public static void main(String[] args) throws Exception {
        String sSentence, sSplit[];
        int nFreq = 0;
        Scanner fin = new Scanner(new FileReader("e1cIN.txt"));

        sSentence = fin.nextLine();
        sSplit = sSentence.split(" ");

        System.out.println("Length of Sentence: " + sSplit.length + " words");
        for (int i = 0; i < sSplit.length; i++) {
            System.out.println("Length of Word " + (i + 1) + ": " + sSplit[i].length());
        }

        for (int i = 0; i < sSentence.length(); i++) {
            if (sSentence.charAt(i) == 'e') {
                nFreq++;
            }
        }
        System.out.println("Number of e's: " + nFreq);
        fin.close();
    }
}