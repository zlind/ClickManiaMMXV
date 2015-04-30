
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lindz0150
 */
public class e1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum1, nAbs;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input a number");
        nNum1 = sin.nextInt();
        if (nNum1 < 0) {
            nAbs = nNum1 * (-1);
            System.out.println("The absoulute value of the integer is " + nAbs);
        } else {
            nAbs = nNum1;
            System.out.println("The absoulute value of the integer is " + nAbs);
        }

    }
}
