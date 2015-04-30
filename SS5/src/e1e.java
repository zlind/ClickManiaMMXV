//Zach Lindner

import java.util.Scanner;

public class e1e {

    public static void main(String[] args) {
        int n1, n2, d1, d2;
        Scanner sin = new Scanner(System.in);

        System.out.println("Numerator 1:");
        n1 = sin.nextInt();
        System.out.println("Denomenator 1:");
        d1 = sin.nextInt();
        System.out.println("Numerator 2:");
        n2 = sin.nextInt();
        System.out.println("Denomenator 2:");
        d2 = sin.nextInt();
        subtract(n1, n2, d1, d2);
    }

    public static void subtract(int n1, int n2, int d1, int d2) {
        int denom, numer;
        n1 *= d2;
        n2 *= d1;
        denom = d1 * d2;
        numer = n1 - n2;
        reduce(numer, denom);
    }

    public static void reduce(int numer, int denom) {
        int n = numer;
        int d = denom;

        while (d != 0) {
            int x = d;
            d = n % d;
            n = x;
        }
        
        int gcd = n;
        numer /= gcd;
        denom /= gcd;
        System.out.println("\nNumerator: " + numer + "\nDenomenator: " + denom);
    }
}
