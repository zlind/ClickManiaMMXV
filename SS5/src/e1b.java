//Zach Lindner

import java.util.Scanner;

public class e1b {

    public static void main(String[] args) {
        double dMark1, dMark2, dMark3, dMark4, dAvg;
        Scanner sin = new Scanner(System.in);
        System.out.println("Mark 1: ");
        dMark1 = sin.nextDouble();
        System.out.println("Mark 2: ");
        dMark2 = sin.nextDouble();
        System.out.println("Mark 3: ");
        dMark3 = sin.nextDouble();
        System.out.println("Mark 4: ");
        dMark4 = sin.nextDouble();
        dAvg = calcAverage(dMark1, dMark2, dMark3, dMark4);
        System.out.println("Average: " + dAvg);
    }

    public static double calcAverage(double dMark1, double dMark2, double dMark3, double dMark4) {
        double dAvg;
        dAvg = (dMark1 + dMark2 + dMark3 + dMark4) / 4;
        return dAvg;
    }
}