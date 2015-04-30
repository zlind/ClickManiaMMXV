//Zach Lindner

import java.util.Scanner;

public class e2b {

    public static void main(String[] args) {
        double dPrinc, dRate, dNewBal, dMonthlyPayment, dIntPaid, dPrincPaid;
        int nTerm, i;
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter amount of loan:");
        dPrinc = sin.nextDouble();
        System.out.print("Enter interest rate per year:");
        dRate = sin.nextDouble() / 12 / 100;
        System.out.print("Enter number of years:");
        nTerm = sin.nextInt() * 12;

        dMonthlyPayment = dPrinc * dRate * Math.pow(1 + dRate, (double) nTerm)
                / (Math.pow(1 + dRate, (double) nTerm) - 1);

        //Print header
        System.out.println("\nAmortization Schedule");
        for (int x = 0; x < 62; x++) {
            System.out.print("-");
        }
        System.out.format("\n%-8s%-12s%-10s%-10s%-10s%-12s", " ", "Old",
                "Monthly", "Interest", "Principle", "New", "Balance");
        System.out.format("\n%-8s%-12s%-10s%-10s%-10s%-12s\n\n", "Month",
                "Balance", "Payment", "Paid", "Paid", "Balance");

        //Print schedule without last month
        for (i = 1; i < nTerm; i++) {
            dIntPaid = dPrinc * dRate;
            dPrincPaid = dMonthlyPayment - dIntPaid;
            dNewBal = dPrinc - dPrincPaid;
            System.out.format("%-8d%-12.3f%-10.3f%-10.3f%-10.3f%-12.3f\n", i,
                    dPrinc, dMonthlyPayment, dIntPaid, dPrincPaid, dNewBal);
            dPrinc = dNewBal;
        }

        //Print the last month
        dPrincPaid = dPrinc;
        dIntPaid = dPrinc * dRate;
        dMonthlyPayment = dPrincPaid + dIntPaid;
        dNewBal = 0.0;
        System.out.format("%-8d%-12.3f%-10.3f%-10.3f%-10.3f%-12.3f\n", i,
                dPrinc, dMonthlyPayment, dIntPaid, dPrincPaid, dNewBal);
    }
}