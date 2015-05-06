//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e1a {

    public static void main(String[] args) throws Exception {
        double ardNum[] = new double[4], ardAvg[] = new double[4], dLarge = 0;
        int nStudent = 1;
        Scanner fin = new Scanner(new FileReader("e1aIN.txt"));

        for (int i = 0; i < ardAvg.length; i++) {
            for (int j = 0; j < ardNum.length; j++) {
                ardNum[j] = fin.nextDouble();
                ardAvg[i] += ardNum[j];
            }
            ardAvg[i] /= ardAvg.length;
            if (ardAvg[i] > dLarge) {
                dLarge = ardAvg[i];
                nStudent++;
            }
            System.out.println("Average of Student #" + (i + 1) + ": "
                    + ardAvg[i] + "%");
        }
        System.out.println("Student #" + (nStudent + 1)
                + " has the highest average with " + dLarge + "%");
        fin.close();
    }
}