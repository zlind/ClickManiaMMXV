//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1d {

    public static void main(String[] args) throws Exception {
        String sFirst[] = new String[4], sLast[] = new String[4];
        double dWage[] = new double[4], dTime, dRate;
        int nChoice;
        Scanner sin = new Scanner(System.in);
        Scanner fin = new Scanner(new FileReader("e1dIN.txt"));

        for (int i = 0; i < 4; i++) {
            sFirst[i] = fin.next();
            sLast[i] = fin.next();
            dTime = fin.nextDouble();
            dRate = fin.nextDouble();
            dWage[i] = dTime * dRate;
            System.out.println(sFirst[i] + " " + sLast[i] + ": $" + dWage[i]);
        }
        fin.close();

        System.out.println("\nWould you like to display only who earned > $300? Yes [1] No [0]");
        nChoice = sin.nextInt();
        if (nChoice == 1) {
            for (int i = 0; i < 4; i++) {
                if (dWage[i] > 300) {
                    System.out.println(sFirst[i] + " " + sLast[i] + ": $" + dWage[i]);
                }
            }
        }
        fin.close();
    }
}