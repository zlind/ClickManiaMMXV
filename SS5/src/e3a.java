//Zach Lindner

import java.util.Scanner;

public class e3a {

    public static void main(String[] args) {
        int x1, y1, x2, y2; 
        double slope, dist;
        Scanner sin = new Scanner(System.in);
        
        System.out.println("X1 Coordinate: ");
        x1 = sin.nextInt();
        System.out.println("Y1 Coordinate: ");
        y1 = sin.nextInt();
        System.out.println("X2 Coordinate: ");
        x2 = sin.nextInt();
        System.out.println("Y2 Coordinate: ");
        y2 = sin.nextInt();
        
        slope = calcSlope(x1, y1, x2, y2);
        System.out.println("Slope: " + slope);
        
        dist = calcDist(x1, y1, x2, y2);
        System.out.println("Distance: " + dist);
    }
    
    public static double calcSlope (int x1, int y1, int x2, int y2){
        double slope;
        slope = (y2 - y1) / (x2 - x1);
        return slope;
    }
    
    public static double calcDist (int x1, int y1, int x2, int y2) {
        double dist;
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }
}