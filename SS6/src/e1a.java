//Zach Lindner

import java.util.Scanner;

public class e1a {

    public static void main(String[] args) {
        double arMark[] = new double[4];
        double dAvg = 0;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input 4 Marks: ");
        for (int i = 0; i < arMark.length; i++) {
            arMark[i] = sin.nextDouble();
            dAvg += arMark[i];
        }
        dAvg /= arMark.length;
        System.out.println("Average: " + dAvg);
    }
}