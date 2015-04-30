//Zach Lindner

import java.util.Scanner;

public class e1i {

    public static void main(String[] args) {
        int nStart, nEnd, nCent, nFahr;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the first number in a range");
        nStart = sin.nextInt();
        System.out.println("Input the last number in a range");
        nEnd = sin.nextInt();
        for (nCent = nStart; nCent <= nEnd; nCent++) {
            nFahr = (nCent * 9) / 5 + 32;
            System.out.println(nFahr);
        }
    }
}
