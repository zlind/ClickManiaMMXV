//Zach Lindner

public class e3a {

    public static void main(String[] args) {
        int arPrime[] = new int[100];
        int a = 0;
        
        for (int i = 2, nPrimeAmt = 0; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                nPrimeAmt++;
                arPrime[a] = i;
                System.out.println(arPrime[a]);
                a++;
            }
            if (nPrimeAmt == 100) {
                break;
            }
        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}