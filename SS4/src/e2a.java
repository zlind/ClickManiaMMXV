//Zach Lindner

public class e2a {

    public static void main(String[] args) {
        char ch;

        for (ch = 'A'; ch <= 'Z'; ch++) {
            if (ch % 5 == 0) {
                System.out.println();
            }
            System.out.print(ch + " ");
        }
    }
}