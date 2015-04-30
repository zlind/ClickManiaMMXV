
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lindz0150
 */
public class e1f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dNum1, dNum2;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input a number");
        dNum1 = sin.nextDouble();
        System.out.println("Input another number");
        dNum2 = sin.nextDouble();
        if (dNum1 < dNum2) {
            System.out.println("The first number is smaller than the second");
        } else if (dNum1 > dNum2) {
            System.out.println("The first number is bigger than the second");
        } else {
            System.out.println("The first number is equal to the second");
        }
    }
}
