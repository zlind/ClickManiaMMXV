/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindz0150
 */
public class e1i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX1, nY1, nX2, nY2, nDX, nDY, nPerim, nArea;
        nX1 = 1;
        nY1 = 2;
        nX2 = 9;
        nY2 = 8;
        nDX = nX2 - nX1;
        nDY = nY2 - nY1;
        nPerim = 2 * (nDX + nDY);
        nArea = nDX * nDY;
        System.out.println("The perimeter is " + nPerim + " and the area is " + nArea);
    }
}
