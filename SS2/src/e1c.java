
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lindz0150
 */
public class e1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nUser;
        double dRad, dArea, dCirc;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the radius of a circle");
        dRad = sin.nextDouble();
        System.out.println("Do you want to calculate the area(1) or circumferece(2) of the circle");
        nUser = sin.nextInt();
        if (nUser == 1) {
            dArea = Math.pow(Math.PI * dRad, 2);
            System.out.println("The area of the radius " + dRad + " is " + dArea);
        } else if (nUser == 2) {
            dCirc = 2 * Math.PI * dRad;
            System.out.println("The circumference of the radius " + dRad + " is " + dCirc);
        } else {
            System.out.println("Invalid option");
        }
    }
}
