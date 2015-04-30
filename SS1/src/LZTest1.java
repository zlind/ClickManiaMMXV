//Zach Lindner

import java.text.NumberFormat;

public class LZTest1 {

    public static void main(String[] args) {
        double dPrinc, dInt, dPeriod, dNumPay, dTopAns, dBottomAns, dAmort;
        dPrinc = 4999.95; //Principal (P)
        dInt = 0.03; //Interest rate (r)
        dPeriod = 14.5; //Number of periods (t)
        dNumPay = 12.3; //Number of payments per period (n)

        //Round to two decimal places
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        //Calculates the top half of the equation
        dTopAns = dPrinc * (dInt / dNumPay);
        //Calculates the bottom half of the equation
        dBottomAns = 1 - Math.pow(1 + (dInt / dNumPay), -1 * dNumPay * dPeriod);
        //Final amortization amount
        dAmort = dTopAns / dBottomAns;
        System.out.println("The monthly payment will be $" + nf.format(dAmort));
    }
}
