//Zach Lindner

import java.util.Scanner;

public class e2d {

    public static void main(String[] args) {
        int nInput, x, y;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input the size of an inverted triangle");
        nInput = sin.nextInt();
        if (nInput <= 30) {
            for (y = nInput; y >= 1; y--) {
                for (x = 3; x < (4 - y) + (2 * y - 1); x++) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }
        }
        else {
            System.out.println("The number must be between 1-30");
        }
    }
}