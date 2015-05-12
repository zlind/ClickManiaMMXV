//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class e2e {

    public static void main(String[] args) throws Exception {
        int x[] = new int[3], y[] = new int[3], a, b, c;
        double dSlope1, dSlope2, dSlope3;
        Scanner fin = new Scanner(new FileReader("e2eIN.txt"));

        for (int i = 0; i < x.length; i++) {
            x[i] = fin.nextInt();
            y[i] = fin.nextInt();
        }

        a = (int) Math.sqrt(Math.pow((x[1] - x[0]), 2) + Math.pow((y[1] - y[0]), 2));
        b = (int) Math.sqrt(Math.pow((x[2] - x[1]), 2) + Math.pow((y[2] - y[1]), 2));
        c = (int) Math.sqrt(Math.pow((x[2] - x[0]), 2) + Math.pow((y[2] - y[0]), 2));

        System.out.println("Length of A: " + a + "\nLength of B: " + b + "\nLength of C: " + c);

        //Triangle Check
        if (a == b && b == c) {
            System.out.println("\n[Equlateral triangle]");
        } else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
            System.out.println("\n[Isosceles Triangle]");
        } else if (a != b && b != c && c != a) {
            System.out.println("\n[Scalene Triangle]");
        }

        //Right Angle Check
        dSlope1 = (y[1] - y[0]) / (x[1] - x[0]);
        dSlope2 = (y[2] - y[1]) / (x[2] - x[1]);
        dSlope3 = (y[2] - y[0]) / (x[2] - x[0]);

        if (dSlope1 == Math.pow(dSlope2, -1)) {
            System.out.println("[Right Triangle]");
        } else if (dSlope2 == Math.pow(dSlope3, -1)) {
            System.out.println("[Right Triangle]");
        } else if (dSlope1 == Math.pow(dSlope3, -1)) {
            System.out.println("[Right Triangle]");
        } else {
            System.out.println("[Not a Right Triangle]");
        }

        //Hypotenuse Check
        if (a > b && a > c) {
            System.out.println("[Hypotenuse  = A]");
        } else if (b > a && b > c) {
            System.out.println("[Hypotenuse  = B]");
        } else {
            System.out.println("[Hypotenuse  = C]");
        }
        fin.close();
    }
}