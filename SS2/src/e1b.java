
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lindz0150
 */
import java.util.Scanner;

public class e1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sName;
        int nAge;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input your name");
        sName = sin.next();
        System.out.println("Input your age");
        nAge = sin.nextInt();
        if (nAge >= 18) {
            System.out.println("Step right up " + sName + " and vote");
        } else {
            System.out.println("Maybe next time, " + sName);
        }
    }
}
