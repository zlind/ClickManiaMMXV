//Zach Lindner

import java.util.Scanner;

public class e1d {

    public static void main(String[] args) {
        double arNum[] = new double[20];
        double dSum = 0, dAvg, dLarge, dSmall;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input up to 20 numbers, [0] to stop");
        int i = 0;
        while (i < 20) {
            arNum[i] = sin.nextDouble();
            if (arNum[i] != 0) {
                dSum += arNum[i];
                i++;
            } else {
                System.out.println("Sum: " + dSum);
                if (dSum != 0) {
                    dAvg = dSum / i;
                    System.out.println("Average: " + dAvg);
                } else {
                    System.out.println("Average: 0.0");
                }
                dLarge = large(arNum);
                System.out.println("Largest Number: " + dLarge);
                dSmall = small(arNum);
                System.out.println("Smallest Number: " + dSmall);
                break;
            }
        }
    }

    public static double large(double arNum[]) {
        double dLarge = arNum[0];
        for (int i = 1; i < arNum.length; i++) {
            if (arNum[i] > dLarge) {
                dLarge = arNum[i];
            }
        }
        return dLarge;
    }

    public static double small(double arNum[]) {
        double dSmall = arNum[0];
        for (int i = 0; i < arNum.length; i++) {
            if (arNum[i] != 0 && dSmall > arNum[i]) {
                dSmall = arNum[i];
            }
        }
        return dSmall;
    }
}