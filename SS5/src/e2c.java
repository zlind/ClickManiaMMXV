//Zach Lindner

import java.util.Scanner;

public class e2c {

    public static void main(String[] args) {
        int nTime;
        Scanner sin = new Scanner(System.in);

        System.out.println("Time Worked in Hours: ");
        nTime = sin.nextInt();
        calcFee(nTime);
    }

    public static void calcFee(int nTime) {
        int nFee = 0;
        while (nTime > 0) {
            nFee += 80;
            nTime -= 1;
        }
    }
}