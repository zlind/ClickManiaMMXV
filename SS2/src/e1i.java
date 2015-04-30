/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
import java.util.Scanner;

public class e1i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dX1, dY1, dX2, dY2, dXSum, dYSum, dLength;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the X of the first point");
        dX1 = sin.nextDouble();
        System.out.println("Input the Y of the first point");
        dY1 = sin.nextDouble();
        System.out.println("Input the X of the second point");
        dX2 = sin.nextDouble();
        System.out.println("Input the Y of the second point");
        dY2 = sin.nextDouble();
        dXSum = Math.abs(dX1) - Math.abs(dX2);
        dYSum = Math.abs(dY1) - Math.abs(dY2);
        if (dXSum == dYSum) {
            System.out.println("The shape is a square");
        } else {
            System.out.println("The shape is a rectangle");
        }
    }
}
