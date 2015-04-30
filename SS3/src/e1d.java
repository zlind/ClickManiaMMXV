//Zach Lindner

public class e1d {

    public static void main(String[] args) {
        int i, nSquare, nCube;
        for (i = 1; i <= 10; i++) {
            nSquare = (int) Math.pow(i, 2);
            nCube = (int) Math.pow(i, 3);
            System.out.println(i + " " + nSquare + " " + nCube);
        }
    }
}
