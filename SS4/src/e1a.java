//Zach Lindner

import java.util.Scanner;

public class e1a {

    public static void main(String[] args) {
        String sChoice;
        double dLength, dWidth, dRad, dArea, dPerim;
        Scanner sin = new Scanner(System.in);

        System.out.println("Do you want to caclculate for a circle(c) or rectangle(r)");
        sChoice = sin.next().toLowerCase();

        switch (sChoice) {
            case "c":
                System.out.println("Do you want to calculate area(a) or perimeter(p)?");
                sChoice = sin.next().toLowerCase();
                switch (sChoice) {
                    case "a":
                        System.out.println("Input the radius");
                        dRad = sin.nextDouble();
                        dArea = Math.PI * Math.pow(dRad, 2);
                        System.out.println("The area is " + dArea);
                        break;
                    case "p":
                        System.out.println("Input the radius");
                        dRad = sin.nextDouble();
                        dPerim = 2 * Math.PI * dRad;
                        System.out.println("The circumference is " + dPerim);
                        break;
                }
                break;
            case "r":
                System.out.println("Do you want to calculate area(a) or perimeter(p)?");
                sChoice = sin.next().toLowerCase();
                switch (sChoice) {
                    case "a":
                        System.out.println("Input the length");
                        dLength = sin.nextDouble();
                        System.out.println("Input the width");
                        dWidth = sin.nextDouble();
                        dArea = dLength * dWidth;
                        System.out.println("The area is " + dArea);
                        break;
                    case "p":
                        System.out.println("Input the length");
                        dLength = sin.nextDouble();
                        System.out.println("Input the width");
                        dWidth = sin.nextDouble();
                        dPerim = (dLength * 2) + (dWidth * 2);
                        System.out.println("The perimeter is " + dPerim);
                        break;
                }
        }
    }
}