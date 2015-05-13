//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class e2f {

    public static void main(String[] args) throws Exception {
        int arnMil[] = new int[3], arnTime[] = new int[2];
        String sTime, sHour, sMin;
        Scanner fin = new Scanner(new FileReader("e2fIN.txt"));

        for (int i = 0; i < arnMil.length; i++) {
            arnMil[i] = fin.nextInt();
        }

        arnTime[0] = Math.abs(arnMil[1] - arnMil[0]);
        sTime = Integer.toString(arnTime[0]);
        if (arnTime[0] < 1200) {
            sHour = Character.toString(sTime.charAt(0));
            sMin = Character.toString(sTime.charAt(1)) + Character.toString(sTime.charAt(2));
            System.out.println(arnMil[0] + "\n" + arnMil[1] + "\n" + sHour + " hours and " + sMin + " minutes\n");
        } else {
            sHour = Character.toString(sTime.charAt(0)) + Character.toString(sTime.charAt(1));
            sMin = Character.toString(sTime.charAt(2)) + Character.toString(sTime.charAt(3));
            System.out.println(arnMil[0] + "\n" + arnMil[1] + "\n" + sHour + " hours and " + sMin + " minutes\n");
        }

        arnTime[1] = Math.abs(arnMil[2] - arnMil[1]);
        sTime = Integer.toString(arnTime[1]);
        if (arnTime[1] < 1200) {
            sHour = Character.toString(sTime.charAt(0));
            sMin = Character.toString(sTime.charAt(1)) + Character.toString(sTime.charAt(2));
            System.out.println(arnMil[1] + "\n" + arnMil[2] + "\n" + sHour + " hours and " + sMin + " minutes");
        } else {
            sHour = Character.toString(sTime.charAt(0)) + Character.toString(sTime.charAt(1));
            sMin = Character.toString(sTime.charAt(1)) + Character.toString(sTime.charAt(2));
            System.out.println(arnMil[1] + "\n" + arnMil[2] + "\n" + sHour + " hours and " + sMin + " minutes");
        }
        fin.close();
    }
}