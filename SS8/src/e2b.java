//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2b {

    public static void main(String[] args) throws Exception {
        String sSentence, sWord[], sLong = "";
        Scanner fin = new Scanner(new FileReader("e2bIN.txt"));

        sSentence = fin.nextLine();
        sWord = sSentence.split(" ");

        for (int i = 1; i < sWord.length; i++) {
            if (sWord[i].length() > sWord[i - 1].length()) {
                sLong = sWord[i];
            }
        }
        sLong = Character.toUpperCase(sLong.charAt(0)) + sLong.substring(1);
        System.out.println("Longest Word: " + sLong + "\nLength: " + sLong.length());
        fin.close();
    }
}