//Zach Lindner

import java.util.Scanner;

public class e1h {

    public static void main(String[] args) {
        int nInput, nNumber, dMod, i;
        i = 0;
        Boolean bDone = false;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input a number, [0] to exit");
        nInput = sin.nextInt();
        nNumber = nInput;

        while (!bDone) {
            if (nInput == 0) {
                bDone = true;
            } else {
                dMod = nNumber % 2;
                if (nNumber == 1) {
                    System.out.println(i + " Loops");
                    System.out.println("\nInput a number, [0] to exit");
                    nInput = sin.nextInt();
                    nNumber = nInput;
                    i = 0;
                } else {
                    if (dMod == 0) {
                        nNumber /= 2;
                        i++;
                    } else {
                        nNumber = 3 * nNumber + 1;
                        i++;
                    }
                }
            }
        }
    }
}