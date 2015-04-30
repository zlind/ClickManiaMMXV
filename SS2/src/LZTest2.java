//Zach Lindner

import java.util.Scanner;
import java.text.NumberFormat;

public class LZTest2 {

    public static void main(String[] args) {
        double dA, dB, dC, dDiscrim, dDenom, dAns1, dAns2;
        Scanner sin = new Scanner(System.in);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        System.out.println("Input the value for A");
        dA = sin.nextDouble();
        System.out.println("Input the value for B");
        dB = sin.nextDouble();
        System.out.println("Input the value for C");
        dC = sin.nextDouble();

        dDiscrim = -4 * dA * dC;
        dDenom = 2 * dA;
        dAns1 = (-dB + Math.sqrt(Math.pow(dB, 2) + dDiscrim)) / dDenom;
        dAns2 = (-dB - Math.sqrt(Math.pow(dB, 2) + dDiscrim)) / dDenom;

        if (dA == 0) {
            System.out.println("The value for A is zero, and the calculation cannot be performed");
        } else if (dDiscrim < 0) {
            System.out.println("The discriminant is negative, and the calculation cannot be performed");
        } else {
            System.out.println("The answers are " + nf.format(dAns1) + " and " + nf.format(dAns2));
        }
    }
}