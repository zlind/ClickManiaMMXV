//Zach Lindner

import java.util.Scanner;

public class e1f {

    public static void main(String[] args) {
        double dX, dY;
        Scanner sin = new Scanner(System.in);

        System.out.println("Input the X coordinate of a point");
        dX = sin.nextDouble();
        System.out.println("Input the Y coordinate of a point");
        dY = sin.nextDouble();
        if (dX == 0 && dY == 0) {
            System.out.println("Origin");
        } else {
            if (dX > 0) {
                if (dY > 0) {
                    System.out.println("NE");
                } else if (dY < 0) {
                    System.out.println("SE");
                } else {
                    System.out.println("E");
                }
            } else if (dX < 0) {
                if (dY > 0) {
                    System.out.println("NW");
                } else if (dY < 0) {
                    System.out.println("SW ");
                } else {
                    System.out.println("W");
                }
            } else {
                if (dY > 0) {
                    System.out.println("N");
                } else if (dY < 0) {
                    System.out.println("S");
                }
            }
        }
    }
}