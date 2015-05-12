//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2c {

    public static void main(String[] args) throws Exception {
        int x[] = new int[4], y[] = new int[4];
        double dSlope1, dSlope2;
        Scanner fin = new Scanner(new FileReader("e2cIN.txt"));

        for (int i = 0; i < x.length; i++) {
            x[i] = fin.nextInt();
            y[i] = fin.nextInt();
        }
        
        dSlope1 = (y[1] - y[0]) / (x[1] - x[0]);
        dSlope2 = (y[3] - y[2]) / (x[3] - x[2]);

        System.out.println("Slope 1: " + dSlope1);
        System.out.println("Slope 2: " + dSlope2);

        if (dSlope1 == Math.pow(dSlope2, -1)) {
            System.out.println("Perpindicular");
        } else {
            System.out.println("!Perpindicular");
        }
        fin.close();
    }
}