/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
public class e1h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX1, nY1, nX2, nY2, nDeltaX, nDeltaY; 
        double dSlope, dDist;
        nX1 = 3;
        nY1 = 5;
        nX2 = 4;
        nY2 = 8;
        nDeltaX = nX2 - nX1;
        nDeltaY = nY2 - nY1;
        dSlope = nDeltaY / nDeltaX;
        dDist = Math.sqrt(Math.pow(nDeltaX, 2)) + (Math.pow(nDeltaY, 2));
        System.out.println("The slope of the line is " + dSlope + " and the length is " + dDist);
    }
}
