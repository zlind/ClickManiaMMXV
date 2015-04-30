//Zach Lindner

import java.util.Scanner;

public class e1a {

    public static void main(String[] args) {
        double dCent;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the degress in centigrade");
        dCent = sin.nextDouble();
        convert(dCent);
    }

    public static void convert(double dCent) {
        double dFahr;
        dFahr = (dCent * 9) / 5 + 32;
        System.out.println("Fahrenheit: " + dFahr);
    }
}