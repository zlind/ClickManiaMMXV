//Zach Lindner

import java.util.Scanner;

public class LZTest6 {

    public static void main(String[] args) {
        int arNum[] = new int[100], nChoice, nCount = 0, nEven, nOdd;
        Scanner sin = new Scanner(System.in);
       
        for (int i = 0; i < arNum.length; i++) {
            System.out.println("Input a number:");
            arNum[i] = sin.nextInt();
            nCount++;
            if (arNum[i] == 0) {
                System.out.println("\nSelect even[1] or odd[2]");
                nChoice = sin.nextInt();
                if (nChoice == 1) {
                    nEven = getEven(arNum, nCount);
                    System.out.println(nEven + " even numbers were entered");
                } else if (nChoice == 2) {
                    nOdd = getOdd(arNum, nCount);
                    System.out.println(nOdd + " odd numbers were entered");
                }
                break;
            }
        }
    }
    
    public static int getEven(int arNum[], int nCount) {
        int nEven = 0;
        for (int i = 0; i < nCount - 1; i++) {
            if (arNum[i] % 2 == 0) {
                nEven++;
            }
        }
        return nEven;
    }
    
    public static int getOdd(int arNum[], int nCount) {
        int nOdd = 0;
        for (int i = 0; i < nCount - 1; i++) {
            if (arNum[i] % 2 != 0) {
                nOdd++;
            }
        }
        return nOdd;
    }
}