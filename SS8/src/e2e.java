//Zach Lindner

import java.io.*;
import java.util.Scanner;

public class e2e {

    public static void main(String[] args) throws Exception {
        int x[] = new int[3], y[] = new int[3], a, b, c;
        Scanner fin = new Scanner(new FileReader("e2eIN.txt"));

        for (int i = 0; i < x.length; i++) {
            x[i] = fin.nextInt();
            y[i] = fin.nextInt();
        }

        a = (int) Math.sqrt(Math.pow((x[1] - x[0]), 2) + Math.pow((y[1] - y[0]), 2));
        b = (int) Math.sqrt(Math.pow((x[2] - x[1]), 2) + Math.pow((y[2] - y[1]), 2));
        c = (int) Math.sqrt(Math.pow((x[2] - x[0]), 2) + Math.pow((y[2] - y[0]), 2));

        System.out.println("Length of AB: " + a + "\nLength of BC: " + b + "\nLength of AC: " + c);
        
        fin.close();
    }
}