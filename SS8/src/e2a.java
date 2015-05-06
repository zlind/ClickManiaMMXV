//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) throws Exception {
        String sSentence, sSplit[];
        Scanner fin = new Scanner(new FileReader("e2aIN.txt"));
        
        sSentence = fin.nextLine();
        sSplit = sSentence.split(" ");
        System.out.println(sSplit.length + " words");
        fin.close();
    }
}