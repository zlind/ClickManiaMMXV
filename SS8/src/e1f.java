//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1f {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        int nHist[] = new int[7], nMath[] = new int[7], nEng[] = new int[7], nAvg[] = new int[7];
        Scanner fin = new Scanner(new FileReader("e1fIN.txt"));

        for (int i = 0; i < 7; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            nHist[i] = fin.nextInt();
            nMath[i] = fin.nextInt();
            nEng[i] = fin.nextInt();
            nAvg[i] = (nHist[i] + nMath[i] + nEng[i]) / 3;

            System.out.println(sFirst + " " + sLast + ": " + nAvg[i] + "%");

            if (nHist[i] >= 80) {
                System.out.println("- achieved higher than 80% in history");
            }

            if (nHist[i] >= 50 && nMath[i] >= 50 && nEng[i] >= 50) {
                System.out.println("- passed all of their courses");
            }

            if (nMath[i] >= 50 || nEng[i] >= 50) {
                System.out.println("- passed either math or english");
            }
        }
    }
}