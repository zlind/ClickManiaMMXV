//Zach Lindner

import java.util.Scanner;

public class e1b {

    public static void main(String[] args) {
        char cInput;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input a character:");
        cInput = sin.next(".").charAt(0);

        if (Character.isDigit(cInput)) {
            System.out.println("Digit");
        } else {
            System.out.println("Letter");
            if (Character.isUpperCase(cInput)) {
                System.out.println("Uppercase");
            } else {
                System.out.println("Lowercase");
            }
        }
    }
}