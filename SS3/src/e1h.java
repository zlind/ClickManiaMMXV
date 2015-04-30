//Zach Lindner

import java.util.Scanner;

public class e1h {

    public static void main(String[] args) {
        int nStart, nEnd, i, nSum = 0;
        Scanner sin = new Scanner(System.in);
        System.out.println("Input the first number in a range");
        nStart = sin.nextInt();
        i = nStart;
        System.out.println("Input the last number in a range");
        nEnd = sin.nextInt();
        while (true) {
            System.out.println(i);
            if (i < nEnd){
                nSum += i;
                i++;
            }
            else {
                nSum += i;
                System.out.println("The sum is " + nSum);
                break;
            }
        }
    }
}
