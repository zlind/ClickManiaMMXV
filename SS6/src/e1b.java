//Zach Lindner

import java.util.Scanner;

public class e1b {

    public static void main(String[] args) {
        double arInput[] = new double[5];
        double dAvg = 0;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input 5 Numbers:");

        for (int i = 0; i < arInput.length; i++) {
            arInput[i] = sin.nextDouble();
            dAvg += arInput[i];
        }
        
        dAvg /= arInput.length;
        System.out.println("Total: " + dAvg + "\nAverage: " + dAvg);
    }
}