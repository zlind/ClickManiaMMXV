//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1c {

    public static void main(String[] args) throws Exception {
        String sSentence, arsSplit[];
        int nFreq = 0;
        Scanner fin = new Scanner(new FileReader("e1cIN.txt"));

        sSentence = fin.nextLine();
        arsSplit = sSentence.split(" ");

        System.out.println("Length of Sentence: " + arsSplit.length + " words");
        for (int i = 0; i < arsSplit.length; i++) {
            System.out.println("Length of Word " + (i + 1) + ": " + arsSplit[i].length());
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