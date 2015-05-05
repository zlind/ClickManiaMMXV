//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1d {

    public static void main(String[] args) throws Exception {
        String sFirst, sLast;
        double dWage[] = new double[4], dTime, dRate;
        Scanner fin = new Scanner(new FileReader("e1dIN.txt"));

        for (int i = 0; i < 4; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            dTime = fin.nextDouble();
            dRate = fin.nextDouble();
            dWage[i] = dTime * dRate;
        }
        fin.close();
    }
}