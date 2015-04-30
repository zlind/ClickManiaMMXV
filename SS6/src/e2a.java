//Zach Lindner

public class e2a {

    public static void main(String[] args) {
        int arDice1[] = new int[1000];
        int arDice2[] = new int[1000];
        int arSum[] = new int[1000];

        int nProbSeven = 0;
        int nProbEleven = 0;

        for (int i = 0; i < arDice1.length; i++) {
            arDice1[i] = (int) (Math.random() * 6) + 1;
            arDice2[i] = (int) (Math.random() * 6) + 1;
            arSum[i] = arDice1[i] + arDice2[i];
            System.out.println("Roll #" + (i + 1) + " - Sum = " + arSum[i]);
            nProbSeven = probSeven(arSum);
            nProbEleven = probEleven(arSum);
        }
        System.out.println("\nProbabilty of Sum Being 7: " + nProbSeven + " / 1000");
        System.out.println("Probabilty of Sum Being 11: " + nProbEleven + " / 1000");
    }

    public static int probSeven(int[] arSum) {
        int nProb = 0;
        for (int i = 0; i < arSum.length; i++) {
            if (arSum[i] == 7) {
                nProb++;
            }
        }
        return nProb;
    }

    public static int probEleven(int[] arSum) {
        int nProb = 0;
        for (int i = 0; i < arSum.length; i++) {
            if (arSum[i] == 11) {
                nProb++;
            }
        }
        return nProb;
    }
}