//Zach Lindner

public class LZTest3 {

    public static void main(String[] args) {
        double dPi, dNumer = 1, dFract = 0;
        int i = 1;

        while (i <= 21) {
            dNumer /= i;
            //Every other number, multiply by (-1)
            if (i > 0) {
                dFract += dNumer;
                i += 2;
                i *= -1;
            } else {
                dFract += dNumer;
                i *= -1;
                i += 2;
            }
        }
        dPi = 4 * dFract;
        System.out.println(dPi);
    }
}