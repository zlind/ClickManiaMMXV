//Zach Lindner

import java.util.Scanner;

public class e3b {

    public static void main(String[] args) {
        double a, b, c, side;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input the side lengths, 0 if the side is unknown"
                + "\nSide A: ");
        a = sin.nextDouble();
        System.out.println("Side B: ");
        b = sin.nextDouble();
        System.out.println("Side C (Hypotenuse): ");
        c = sin.nextDouble();
        side = calcSide(a, b, c);
        System.out.println("Unknown Side Length: " + side);
    }

    public static double calcSide(double a, double b, double c) {
        double side = 0;
        if (a == 0) {
            a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            side = a;
        } else if (b == 0) {
            b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            side = b;
        } else if (c == 0) {
            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            side = c;
        }
        return side;
    }
}