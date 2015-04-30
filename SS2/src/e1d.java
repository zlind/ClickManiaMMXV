
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lindz0150
 */
public class e1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum1, nNum2, nDif, nAbs;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input a number");
        nNum1 = sin.nextInt();
        System.out.println("Input another number");
        nNum2 = sin.nextInt();
        nDif = nNum1 - nNum2;
        if (nDif < 0) {
            nAbs = nDif * (-1);
            System.out.println("The positive difference of the numbers is " + nAbs);
        } else {
            System.out.println("The positive difference of the numbers is " + nDif);
        }
    }
}
