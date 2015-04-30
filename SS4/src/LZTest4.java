//Zach Lindner

import java.util.Scanner;

public class LZTest4 {

    public static void main(String[] args) {
        int nSize, nMine1, nMine2, i;
        Scanner sin = new Scanner(System.in);

        System.out.println("How big is the map?");
        nSize = sin.nextInt();
        System.out.println("Where is mine #1?");
        nMine1 = sin.nextInt();
        System.out.println("Where is mine #2?");
        nMine2 = sin.nextInt();

        if (nSize >= nMine1 && nSize >= nMine2) {
            System.out.println("Here is the map:");
            for (i = 1; i <= nSize; i++) {
                if (i == nMine1 || i == nMine2) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
        } else {
            System.out.println("The mine can't be outside of the map");
        }
    }
}