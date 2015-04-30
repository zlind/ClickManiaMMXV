//Zach Lindner

public class e2b {

    public static void main(String[] args) {
        int nSize = 10;
        
        System.out.println();
       
        for (int i = 1; i <= nSize; i++) {
            for (int j = 1; j <= nSize; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}