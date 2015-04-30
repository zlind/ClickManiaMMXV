//Zach Lindner

import java.text.NumberFormat;
import java.util.Scanner;

public class e1c {

    public static void main(String[] args) {
        double dPrice, dServ, dTax, dTotal;
        String sInput;
        Scanner sin = new Scanner(System.in);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        do {
            System.out.println("What is the sales price of the fancy restaurant meal");
            dPrice = sin.nextDouble();
            dServ = dPrice * 0.1;
            dTax = dPrice * 0.05;
            dTotal = dPrice + dServ + dTax;
            System.out.println("The service charge is: $" + nf.format(dServ));
            System.out.println("The tax is: $" + nf.format(dTax));
            System.out.println("The total is: $" + nf.format(dTotal));
            System.out.println("\nWould you like to display another price? Y = yes N = no");
            sInput = sin.next();
        } while (sInput.equalsIgnoreCase("y"));
    }
}