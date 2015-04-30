//Zach Lindner

import java.util.Scanner;

public class e2a {

    public static void main(String[] args) {
        int nChoice;
        double dInput;
        Scanner sin = new Scanner(System.in);

        System.out.println("Convert from centigrade to fahrenheit [1] or "
                + "fahrenheit to centigrade [2]");
        nChoice = sin.nextInt();
        System.out.println("Input a number to be converted");
        dInput = sin.nextDouble();
        convert(nChoice, dInput);
    }

    public static void convert(int nChoice, double dInput) {
        double t;
        if (nChoice == 1) {
            t = (dInput * 9) / 5 + 32;
            System.out.println("Temperature: " + t);
        } else if (nChoice == 2) {
            t = (dInput - 32) * 5 / 9;
            System.out.println("Temperature: " + t);
        } else {
            System.out.println("Invalid option");
        }
    }
}