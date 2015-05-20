//Zach Lindner

import java.util.Scanner;
import java.io.FileReader;

public class LZTest8 {

    public static void main(String[] args) throws Exception {
        int arnX[] = new int[15], arnY[] = new int[15], nDX, nDY;
        double[] ardSlope = new double[15];
        Boolean bRight = false;
        Scanner fin = new Scanner(new FileReader("Pythagoras.txt"));

        for (int i = 0; i < 15; i++) {
            arnX[i] = fin.nextInt();
            arnY[i] = fin.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 10; k++) {
                nDX = arnX[k] - arnX[k + 1];
                nDY = arnY[k] - arnY[k + 1];
                if (nDX == 0) {
                    ardSlope[k] = -1;
                } else {
                    ardSlope[k] = nDY / nDX;
                }
                bRight = isRight(ardSlope, k);
            }
            if (bRight == true) {
                System.out.println("Set #" + (j + 1) + " is a right angle triangle");
            } else {
                System.out.println("Set #" + (j + 1) + " is not a right angle triangle");
            }
        }
        fin.close();
    }

    public static boolean isRight(double[] ardSlope, int k) {
        if (ardSlope[k] * ardSlope[k + 1] == -1) {
            return true;
        } else {
            return false;
        }
    }
}