//Zach Lindner

public class e2e {

    public static void main(String[] args) {
        int x, y, a, b;
        for (x = 1; x <= 8; x += 2) {
            for (y = 0; y < x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (a = 5; a >= 0; a -= 2) {
            for (b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}