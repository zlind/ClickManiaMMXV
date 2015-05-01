//Zach Lindner

import java.io.*;
import java.util.*;

public class e1a {

    public static void main(String[] args) throws Exception {
        double ardNum[] = new double[4], ardAvg[] = new double[4];
        Scanner sin = new Scanner(new FileReader("81aIN.txt"));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ardNum[j] = sin.nextInt();
                ardAvg[i] += ardNum[j];
            }
            ardAvg[i] /= ardAvg.length;
            System.out.println("Average of Student #" + (i + 1) + ": " + ardAvg[i] + "%");
        }

        sin.close();
    }
}
