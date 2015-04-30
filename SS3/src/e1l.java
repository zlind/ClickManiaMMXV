//Zach Lindner

import java.util.*;

public class e1l {

    public static void main(String[] args) {
        int nNumSecret, nGuess;
        Random rand = new Random();
        Boolean bDone = false;
        Scanner sin = new Scanner(System.in);
        
        nNumSecret = rand.nextInt(100);
        while (!bDone) {
            System.out.println("Guess the number between 0 - 100");
            nGuess = sin.nextInt();
            if (nGuess > 100) {
                System.out.println("The number is between 0 - 100");
            } else if (nGuess != nNumSecret) {
                if (nGuess > nNumSecret) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");
                }
            } else {
                System.out.println("You guessed it!");
                bDone = true;
            }
        }
    }
}