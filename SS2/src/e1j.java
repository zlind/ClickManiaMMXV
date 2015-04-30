//Zach Lindner

import java.util.Scanner;

public class e1j {

    public static void main(String[] args) {
        double dX, dY;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the X coordinate of a point");
        dX = sin.nextDouble();
        System.out.println("Input the Y coordinate of a point");
        dY = sin.nextDouble();
        if (dX > 0 && dY > 0) {
            System.out.println("The point is in the NE sector");
        } else if (dX < 0 && dY > 0) {
            System.out.println("The point is in the NW sector");
        } else if (dX > 0 && dY < 0) {
            System.out.println("The point is in the SE sector");
        } else {
            System.out.println("The point is in the SW sector");
        }
    }
}
