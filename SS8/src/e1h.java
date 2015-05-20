//Zach Lindner

import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e1h {

    public static void main(String[] args) throws Exception {
        int nNum1, nNum2, nGCD;
        Scanner fin = new Scanner(new FileReader("e1hIN.txt"));

        for (int i = 0; i < 4; i++) {
            nNum1 = fin.nextInt();
            nNum2 = fin.nextInt();
            nGCD = getGCD(nNum1, nNum2);
            System.out.println(nGCD);
        }
        fin.close();
    }

    public static int getGCD(int nNum1, int nNum2) {
        BigInteger bNum1 = BigInteger.valueOf(nNum1);
        BigInteger bNum2 = BigInteger.valueOf(nNum2);
        BigInteger bGCD = bNum1.gcd(bNum2);
        return bGCD.intValue();
    }
}