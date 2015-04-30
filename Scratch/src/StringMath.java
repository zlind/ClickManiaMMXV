//Zach Lindner

import java.util.Scanner;

public class StringMath {

    public static void main(String[] args) {
        char ch = 'z', letter;
        int key, rem;
        Scanner sin = new Scanner(System.in);

        key = sin.nextInt();
        letter = (char) (ch + key);

        if (letter > 26) {
            rem = (key / 26) + 1;
            key = 26 - (key / rem);
            letter = (char) (ch + key);
        } else {
        }

        System.out.println("letter: " + letter);
        System.out.println("key: " + key);
    }
}
