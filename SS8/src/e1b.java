//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1b {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        Scanner fin = new Scanner(new FileReader("e1bIN.txt"));

        for (int i = 0; i < 6; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            System.out.print(Character.toUpperCase(sFirst.charAt(0)) 
                    + sFirst.substring(1).toLowerCase());
            System.out.print(" " + Character.toUpperCase(sLast.charAt(0)) 
                    + sLast.substring(1).toLowerCase() + "\n");
        }
        fin.close();
    }
}