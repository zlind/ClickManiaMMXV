/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
import java.text.NumberFormat;

public class e1j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dA, dB, dC, dDiscrim, dAns1, dAns2;
        dA = 3.2;
        dB = 11.3;
        dC = -24.7;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        dDiscrim = (-4) * dA * dC;
        dAns1 = (-dB + Math.sqrt(((Math.pow(dB, 2)) + dDiscrim))) / (2 * dA);
        dAns2 = (-dB - Math.sqrt(((Math.pow(dB, 2)) + dDiscrim))) / (2 * dA);
        System.out.println("The answers are " + nf.format(dAns1) + " and " + nf.format(dAns2));
    }
}
