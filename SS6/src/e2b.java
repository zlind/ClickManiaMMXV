//Zach Lindner

import java.util.Random;

public class e2b {

    public static void main(String[] args) {
        Random r = new Random();
        int nNum[] = new int[2000];
        int nFreq[] = new int[31];

        for (int i = 0; i < nNum.length; i++) {
            nNum[i] = r.nextInt(30 - 10 + 1) + 10;
            for (int a = 10; a < nFreq.length; a++) {
                if (nNum[i] == a) {
                    nFreq[a]++;
                }
            }
        }

        for (int x = 10; x < nFreq.length; x++) {
            System.out.println("Frequency of " + x + " = " + nFreq[x]);
        }
    }
}
