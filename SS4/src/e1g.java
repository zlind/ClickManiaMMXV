//Zach Lindner

import java.util.Scanner;

public class e1g {

    public static void main(String[] args) {
        int nInput, nNum1, nNum2;
        String sNumber;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input an integer");
        nInput = sin.nextInt();
        nNum1 = nInput;
        nNum2 = nInput;
        sNumber = "" + nNum1;

        System.out.println("\nOutput:");
        for (int i = 0; i < sNumber.length(); i++) {
            System.out.println(sNumber.charAt(i));
        }
        System.out.println("\nReverse:");
        while (nNum2 > 0) {
            System.out.println(nNum2 % 10);
            nNum2 /= 10;
        }
    }
}