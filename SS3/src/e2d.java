//Zach Lindner

import java.util.Scanner;

public class e2d {

    public static void main(String[] args) {
        int nDec, nBin;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input a number in decimal");
        nDec = sin.nextInt();

        while (nDec > 0) {
            nBin = nDec % 2;
            nDec /= 2;
            System.out.println(nBin);
        }
    }
}
