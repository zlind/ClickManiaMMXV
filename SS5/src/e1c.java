//Zach Lindner

import java.util.Scanner;

public class e1c {

    public static void main(String[] args) {
        double dNum1, dNum2;
        Scanner sin = new Scanner(System.in);
        System.out.println("Number 1: ");
        dNum1 = sin.nextDouble();
        System.out.println("Number 2: ");
        dNum2 = sin.nextDouble();
        difference(dNum1, dNum2);
    }

    public static void difference(double dNum1, double dNum2) {
        double dDif;
        dDif = Math.abs(dNum1 - dNum2);
        System.out.println("Difference: " + dDif);
    }
}