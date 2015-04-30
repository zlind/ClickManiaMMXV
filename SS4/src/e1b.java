//Zach Lindner

import java.util.Scanner;

public class e1b {

    public static void main(String[] args) {
        double dBal, dDpst, dWthd;
        Boolean bDone = false;
        String sInput;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input your bank balance:");
        dBal = sin.nextDouble();
        System.out.println("Would you like to deposit[d], withdraw[w], or exit[e]");
        sInput = sin.next().toLowerCase();

        while (!bDone) {
            if (sInput.equals("d")) {
                System.out.println("How much would you like to deposit:");
                dDpst = sin.nextDouble();
                dBal += dDpst;
                System.out.println("Your updated balance is: " + dBal);
                System.out.println("\nWould you like to deposit[d], withdraw[w], or exit[e]");
                sInput = sin.next().toLowerCase();
            } else if (sInput.equals("w")) {
                System.out.println("How much would you like to withdraw:");
                dWthd = sin.nextDouble();
                if (dBal >= dWthd) {
                    dBal -= dWthd;
                    System.out.println("Your updated balance is: " + dBal);
                    System.out.println("\nWould you like to deposit[d], withdraw[w], or exit[e]");
                    sInput = sin.next().toLowerCase();
                } else {
                    System.out.println("You cannot withdraw more than your balance");
                    System.out.println("\nWould you like to deposit[d], withdraw[w], or exit[e]");
                    sInput = sin.next().toLowerCase();
                }
            } else if (sInput.equals("e")) {
                bDone = true;
            }
        }
    }
}
