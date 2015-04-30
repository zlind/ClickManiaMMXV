//Zach Lindner

import java.util.Random;
import java.util.Scanner;

public class e3b {

    public static void main(String[] args) {
        Random r = new Random();
        int arGuess[] = new int[1000], nNum = r.nextInt(100), nHoldHigh = 0, 
                nHoldLow = 0, nGuess = 0;
        Boolean bHigh = false, bLow = false;
        Scanner sin = new Scanner(System.in);

        System.out.println("Guess the Random Number: ");
        for (int i = 0; arGuess[i] != nNum; i++) {
            arGuess[i] = sin.nextInt();
            if (arGuess[i] < nNum) {
                if (arGuess[i] < nHoldHigh && bHigh == true) {
                    System.out.println("I said higher you dank");
                    nGuess++;
                    System.out.println(nGuess + " guess(es)");
                } else {
                    System.out.println("Higher");
                    nGuess++;
                    System.out.println(nGuess + " guess(es)");
                    if (bHigh == false) {
                        nHoldHigh = arGuess[i];
                        bHigh = true;
                    }
                }
            } else if (arGuess[i] > nNum) {
                if (arGuess[i] > nHoldLow && bLow == true) {
                    System.out.println("I said lower you dank");
                    nGuess++;
                    System.out.println(nGuess + " guess(es)");
                } else {
                    System.out.println("Lower");
                    nGuess++;
                    System.out.println(nGuess + " guess(es)");
                    if (bLow == false) {
                        nHoldLow = arGuess[i];
                        bLow = true;
                    }
                }
            } else {
                System.out.println("Correct!");
                nGuess++;
                System.out.println("You took " + nGuess + " guess(es)");
                break;
            }
        }
    }
}