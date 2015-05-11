//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2d {

    public static void main(String[] args) throws Exception {
        int x[] = new int[4], y[] = new int[4];
        Scanner fin = new Scanner(new FileReader("e2dIN.txt"));

        for (int i = 0; i < (x.length - 1); i++) {
            x[i] = fin.nextInt();
            y[i] = fin.nextInt();
        }

        x[3] = (x[0] + x[1] + x[2]) / 3;
        y[3] = (y[0] + y[1] + y[2]) / 3;

        System.out.println("X of Centroid: " + x[3] + "\nY of Centroid: " + y[3]);

        fin.close();
    }
}