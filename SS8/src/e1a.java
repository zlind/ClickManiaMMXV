//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1a {

    public static void main(String[] args) throws Exception {
        double ardNum[] = new double[4], ardAvg[] = new double[4];
        Scanner fin = new Scanner(new FileReader("e1aIN.txt"));

        for (int i = 0; i < ardAvg.length; i++) {
            for (int j = 0; j < ardNum.length; j++) {
                ardNum[j] = fin.nextDouble();
                ardAvg[i] += ardNum[j];
            }
            ardAvg[i] /= ardAvg.length;
            System.out.println("Average of Student #" + (i + 1) + ": "
                    + ardAvg[i] + "%");
        }
        fin.close();
    }
}