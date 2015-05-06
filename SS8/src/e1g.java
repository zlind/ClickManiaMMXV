//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1g {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        int nCheq[] = new int[5];
        double dCost[] = new double[5];
        Scanner fin = new Scanner(new FileReader("e1gIN.txt"));

        for (int i = 0; i < 5; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            nCheq[i] = fin.nextInt();
            nCheq[i] -= 5;
            System.out.print(sFirst + " " + sLast);

            if (nCheq[i] <= 0) {
                dCost[i] = 0;
                System.out.print(" $" + dCost[i] + "\n");
            } else {
                dCost[i] = nCheq[i] * 0.15;
                System.out.print(" $" + dCost[i] + "\n");
            }
        }
    }
}