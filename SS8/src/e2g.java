//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class e2g {

    public static void main(String[] args) throws Exception {
        int n1, n2, d1, d2;
        Scanner fin = new Scanner(new FileReader("e2gIN.txt"));

        n1 = fin.nextInt();
        d1 = fin.nextInt();
        n2 = fin.nextInt();
        d2 = fin.nextInt();
        add(n1, n2, d1, d2);

        fin.close();
    }

    public static void add(int n1, int n2, int d1, int d2) {
        int denom, numer;
        n1 *= d2;
        n2 *= d1;
        denom = d1 * d2;
        numer = n1 + n2;
        System.out.println(asFraction(numer, denom));
    }

    public static String asFraction(int numer, int denom) {
        int gcm = gcm(numer, denom);
        return (numer / gcm) + "/" + (denom / gcm);
    }

    public static int gcm(int numer, int denom) {
        return denom == 0 ? numer : gcm(denom, numer % denom);
    }
}