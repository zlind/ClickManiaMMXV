//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1d {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        double dWage[] = new double[4], dTime, dRate;
        int nChoice;
        Scanner sin = new Scanner(System.in);
        Scanner fin = new Scanner(new FileReader("e1dIN.txt"));

        for (int i = 0; i < 4; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            dTime = fin.nextDouble();
            dRate = fin.nextDouble();
            dWage[i] = dTime * dRate;
            System.out.println(sFirst + " " + sLast + ": $" + dWage[i]);
        }
        fin.close();

        System.out.println("\nWould you like to display only who earn >$300? Yes [1] No [0]");
        nChoice = sin.nextInt();
        if (nChoice == 1) {
            for (int i = 0; i < 4; i++) {
                if (dWage[i] > 300) {
                    System.out.println(dWage[i]);
                }
            }
        }
        fin.close();
    }
}