//Zach Lindner

import java.util.Scanner;

public class e1g {

    public static void main(String[] args) {
        String sInput;
        Scanner sin = new Scanner(System.in);
        do {
            System.out.println("Is the light green");
            sInput = sin.next();
            if (sInput.equalsIgnoreCase("yes")) {
                System.out.println("You may cross the intersection");
                break;
            }
        } while (true);
    }
}