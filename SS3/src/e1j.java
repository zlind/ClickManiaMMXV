//Zach Lindner

import java.util.Scanner;

public class e1j {

    public static void main(String[] args) {
        int nNum = 0;
        double dInput, dAvg, dSum = 0;
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            dInput = sin.nextInt();
            if (dInput == 0) {
                System.out.println("The total of all of the numbers is " + dSum);
                dAvg = dSum / nNum;
                System.out.println("The average of all of the numbers is " + dAvg);
                break;
            } else {
                dSum += dInput;
                nNum++;
            }
        }
    }
}
