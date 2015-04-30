//Zach Lindner

import java.util.Scanner;

public class e1k {

    public static void main(String[] args) {
        double i, dFact = 1;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input a number");
        for (i = sin.nextDouble(); i > 0; i--) {
            dFact *= i;
        }
        System.out.println("The factorial is " + dFact);
    }
}
