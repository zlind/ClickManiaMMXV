//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) throws Exception {
        String sSentence, sSplit[];
        int nLength = 0;
        Scanner fin = new Scanner(new FileReader("e2aIN.txt"));
        
        sSentence = fin.nextLine();
        sSplit = sSentence.split(" ");
        for (int i = 0; i < sSplit.length; i++) {
            nLength++;
        }
        System.out.println(nLength + " words");
        fin.close();
    }
}