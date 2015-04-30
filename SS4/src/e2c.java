//Zach Lindner

public class e2c {

    public static void main(String[] args) {
        int x, y;
        for (y = 5; y >= 1; y--) {
            for (x = 3; x < (4 - y) + (2 * y - 1); x++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}