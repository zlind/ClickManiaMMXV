//Zach Lindner

import java.util.Scanner;
public class e1l {

    public static void main(String[] args) {
        double dX1, dY1, dX2, dY2, dDX, dDY, dSlope;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the X of the first point");
        dX1 = sin.nextDouble();
        System.out.println("Input the Y of the first point");
        dY1 = sin.nextDouble();
        System.out.println("Input the X of the second point");
        dX2 = sin.nextDouble();
        System.out.println("Input the Y of the second point");
        dY2 = sin.nextDouble();
        dDX = dX2 - dX1;
        dDY = dY2 - dY1;
        dSlope = dDY / dDX;
        if (dDX == 0){
            System.out.println("The slope is undefined");
        }
        else {
            System.out.println("The slope is " + dSlope);
        }
    }
}
