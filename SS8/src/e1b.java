//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1b {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        boolean firstGood, lastGood;
        Scanner fin = new Scanner(new FileReader("e1bIN.txt"));

        for (int i = 0; i < 6; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            firstGood = firstGood(sFirst);
            lastGood = lastGood(sLast);
            if (firstGood && lastGood) {
                System.out.println(sFirst + " " + sLast);
            }
        }
        fin.close();
    }

    public static boolean firstGood(String sFirst) {
        Character ch;
        if (Character.isLowerCase(sFirst.charAt(0))) {
            return false;
        }
        for (int i = 1; i < sFirst.length(); i++) {
            ch = sFirst.charAt(i);
            if (Character.isUpperCase(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean lastGood(String sLast) {
        Character ch;
        if (Character.isLowerCase(sLast.charAt(0))) {
            return false;
        }
        for (int i = 1; i < sLast.length(); i++) {
            ch = sLast.charAt(i);
            if (Character.isUpperCase(ch)) {
                return false;
            }
        }
        return true;
    }
}