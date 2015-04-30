//Zach Lindner

public class e1c {

    public static void main(String[] args) {
        int nCent, nFahr;
        for (nCent = -10; nCent <= 10; nCent++) {
            nFahr = (nCent * 9) /5 + 32;
            System.out.println(nCent + ": " + nFahr);
        }
    }
}
