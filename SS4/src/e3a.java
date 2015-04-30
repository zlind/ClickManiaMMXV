//Zach Lindner

import java.text.NumberFormat;
import java.util.Scanner;

public class e3a {

    public static void main(String[] args) {
        double dSa, dSb, dSc, dAA, dAB, dAC, dAARad, dAADeg, dACRad, dACDeg;
        Scanner sin = new Scanner(System.in);
        
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        
        System.out.println("Input the  length of side a");
        dSa = sin.nextDouble();
        System.out.println("Input the  length of side b");
        dSb = sin.nextDouble();
        System.out.println("Input the  length of side c");
        dSc = sin.nextDouble();
        
        dAC = ((-1 * Math.pow(dSc, 2)) + Math.pow(dSa, 2) + Math.pow(
                dSb, 2)) / (2 * dSa * dSb);
        dACRad = Math.acos(dAC);
        dACDeg = dACRad * 180 / Math.PI;
        
        dAA = (dSa * Math.sin(dACRad)) / dSc;
        dAARad = Math.asin(dAA);
        dAADeg = dAARad * 180 / Math.PI;
        
        dAB = 180 - dACDeg - dAADeg;
       
        System.out.println("\nAngle A: " + nf.format(dAADeg) + "°");
        System.out.println("Angle B: " + nf.format(dAB) + "°");
        System.out.println("Angle C: " + nf.format(dACDeg) + "°");
    }
}