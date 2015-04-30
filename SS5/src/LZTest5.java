//Zach Lindner

import java.util.Scanner;

public class LZTest5 {

    public static void main(String[] args) {
        double dA, dB, dC, dY;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input a value for A: ");
        dA = sin.nextDouble();
        System.out.println("Input a value for B: ");
        dB = sin.nextDouble();
        System.out.println("Input a value for C: ");
        dC = sin.nextDouble();

        for (int x = 0; x <= 10; x++) {
            dY = quad(dA, dB, dC, x);
            System.out.println("f(" + x + ") = " + dY);
        }
    }

    public static double quad(double dA, double dB, double dC, int x) {
        double dY;
        dY = (dA * Math.pow(x, 2)) + (dB * x) + dC;
        return dY;
    }
}