/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
import java.util.Scanner;

public class e1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nCent, nFahr, nInput;
        Scanner sin = new Scanner(System.in);
        System.out.println("Do you want to convert to Fahrenheit(1) or to Centigrade(2)");
        nInput = sin.nextInt();
        if (nInput == 1) {
            System.out.println("Input the temperature in Centigrade");
            nCent = sin.nextInt();
            nFahr = (nCent * 9) / 5 + 32;
            System.out.println("The temperature in Fahrenheit is " + nFahr);
        } else if (nInput == 2) {
            System.out.println("Input the temperature in Fahrenheit");
            nFahr = sin.nextInt();
            nCent = (nFahr - 32) * 5 / 9;
            System.out.println("The temperature in Centigrade is " + nCent);
        } else {
            System.out.println("Invalid option");
        }
    }
}
