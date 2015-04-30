//Zach Lindner

import java.text.NumberFormat;
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) {

        double dBal, dBalEnd, dRate, dInt, dTime;
        int t = 1; 

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        Scanner sin = new Scanner(System.in);
        System.out.println("Input your bank balance");
        dBal = sin.nextDouble();
        System.out.println("Input the annual interest rate");
        dRate = sin.nextDouble() / 100 / 12;
        System.out.println("How many years are you going to invest");
        dTime = sin.nextDouble() * 12;

        while (t <= dTime) {
            System.out.println("Month: " + t);
            System.out.println("Beginning Balance: " + nf.format(dBal));
            dInt = dRate * dBal;
            System.out.println("Interest: " + nf.format(dInt));
            dBalEnd = dBal + dInt;
            System.out.println("Ending Balance: " + nf.format(dBalEnd) + "\n");
            dBal = dBalEnd;
            t++;
        }
    }
}
