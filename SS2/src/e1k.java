//Zach Lindner
import java.util.Random;
import java.util.Scanner;

public class e1k {

    public static void main(String[] args) {
        Random rNum1 = new Random();
        Random rNum2 = new Random();
        int nNum1, nNum2, nAns;
        Scanner sin = new Scanner(System.in);
        
        nNum1 = rNum1.nextInt(1000);
        nNum2 = rNum2.nextInt(1000);
        
        System.out.println(" " + nNum1);
        System.out.println("+" + nNum2);
        nAns = sin.nextInt();
        
        if (nAns == nNum1 + nNum2) {
            System.out.println("Congratulations!");
        } else {
            System.out.println(nNum1 + nNum2);
        }
    }
}
