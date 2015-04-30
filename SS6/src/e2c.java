//Zach Lindner

import java.util.Scanner;

public class e2c {

    public static void main(String[] args) {
        int a, q, k, x;
        int y[] = new int[11];
        Scanner sin = new Scanner(System.in);

        System.out.println("A: ");
        a = sin.nextInt();
        System.out.println("Q: ");
        q = sin.nextInt();
        System.out.println("K: ");
        k = sin.nextInt();

        for (x = 0; x < y.length; x++) {
            y[x] = (int) (a * Math.pow(((x - 5) - q), 2) + k);
            System.out.println("f(" + (x - 5) + ") = " + y[x]);
        }
    }
}