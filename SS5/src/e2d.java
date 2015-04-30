//Zach Lindner

import java.util.Scanner;

public class e2d {

    public static void main(String[] args) {
        double dMass, dHeight;
        Scanner sin = new Scanner(System.in);
        
        System.out.println("Mass: ");
        dMass = sin.nextDouble();
        System.out.println("Height (Inches): ");
        dHeight = sin.nextDouble();
        calcBMI(dMass, dHeight);
    }
    
    public static void calcBMI (double dMass, double dHeight) {
        double dBMI;
        String[] sStatus = {"Underweight", "Normal Weight", "Overweight",  "Obeise"};
        dBMI = (dMass * 703) / Math.pow(dHeight, 2);
        System.out.println("BMI: " + dBMI);
        if (dBMI <= 18.5) {
            System.out.println("Status: " + sStatus[1]);
        }
        else if(dBMI > 18.5 &&  dBMI <= 24.9) {
            System.out.println("Status: " + sStatus[2]);
        }
        else if(dBMI > 24.9 && dBMI <= 29.9) {
            System.out.println("Status: " + sStatus[3]);
        }
        else if(dBMI <= 30) {
            System.out.println("Status: " + sStatus[1]);
        }
    }
}