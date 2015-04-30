//Zach Lindner

import java.util.Scanner;

public class e4a {

    public static void main(String[] args) {

        double dAA, dAB, dAC, dSa, dSb, dSc;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input angle A: ");
        dAA = sin.nextDouble();
        System.out.println("Input angle B: ");
        dAB = sin.nextDouble();
        System.out.println("Input angle C: ");
        dAC = sin.nextDouble();
        System.out.println("Input the side length of a ");
        dSa = sin.nextDouble();

        dSb = (dSa * Math.sin(dAB)) / Math.sin(dAA);
        System.out.println(dSb);
    }
}