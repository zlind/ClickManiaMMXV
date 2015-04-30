/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
import java.text.NumberFormat;

public class e1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dNum1, dNum2, dQuo;
        dNum1 = 3.7;
        dNum2 = 11.4;
        dQuo = dNum2 / dNum1;
        NumberFormat nf = NumberFormat.getNumberInstance(); 
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        System.out.println("The quotient is " + nf.format(dQuo));
    }
}
