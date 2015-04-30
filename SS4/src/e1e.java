//Zach Lindner

import java.util.Scanner;

public class e1e {

    public static void main(String[] args) {
        int nNum1, nNum2, nQuo, nRem;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input an integer");
        nNum1 = sin.nextInt();
        System.out.println("Input another integer");
        nNum2 = sin.nextInt();

        if (nNum1 >= nNum2) {
            nQuo = nNum1 / nNum2;
            nRem = nNum1 % nNum2;
            if (nRem == 0) {
                System.out.println("The quotient is " + nQuo);
            } else {
                System.out.println("The quotient is " + nQuo + " with a remainder of " + nRem);
            }
        } else if (nNum1 <= nNum2) {
            nQuo = nNum2 / nNum1;
            nRem = nNum2 % nNum1;
            if (nRem == 0) {
                System.out.println("The quotient is " + nQuo);
            } else {
                System.out.println("The quotient is " + nQuo + " with a remainder of " + nRem);
            }
        }
    }
}