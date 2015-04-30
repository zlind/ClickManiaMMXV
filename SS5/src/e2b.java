//Zach Lindner

import java.util.Scanner;

public class e2b {

    public static void main(String[] args) {
        int nNum1, nNum2;
        Scanner sin = new Scanner(System.in);

        System.out.println("Number 1: ");
        nNum1 = sin.nextInt();
        System.out.println("Number 2: ");
        nNum2 = sin.nextInt();
        LCM(nNum1, nNum2);
    }

    private static void LCM(int nNum1, int nNum2) {
        int lcm = (nNum2 == nNum1 || nNum2 == 1) ? nNum1 : 
                (nNum1 == 1 ? nNum2 : 0);

        if (lcm == 0) {
            int x = nNum1, y = nNum2;
            while (x != y) {
                while (x < y) {
                    x += nNum1;
                }
                while (y < x) {
                    y += nNum2;
                }
            }
            lcm = x;
        }
        System.out.println("Lowest Common Multiple(" + nNum1 + ", " + nNum2 + ") = " + lcm);
    }
}