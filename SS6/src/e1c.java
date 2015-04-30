//Zach Lindner

import java.util.Scanner;

public class e1c {

    public static void main(String[] args) {
        int arNum[] = new int[5];
        int nLarge, nSmall;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input 5 Numbers: ");
        for (int i = 0; i < arNum.length; i++) {
            arNum[i] = sin.nextInt();
        }

        nLarge = large(arNum);
        System.out.println("Largest Number: " + nLarge);
        nSmall = small(arNum);
        System.out.println("Smallest Number: " + nSmall);
    }

    public static int large(int arNum[]) {
        int nLarge = arNum[0];
        for (int i = 1; i < arNum.length; i++) {
            if (arNum[i] > nLarge) {
                nLarge = arNum[i];
            }
        }
        return nLarge;
    }

    public static int small(int arNum[]) {
        int nSmall = arNum[0];
        for (int i = 0; i < arNum.length; i++) {
            if (arNum[i] != 0 && nSmall > arNum[i]) {
                nSmall = arNum[i];
            }
        }
        return nSmall;
    }
}