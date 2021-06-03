package LevelOne.gettingStarted;

import java.util.Scanner;

public class PrintPrimeInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int start = scn.nextInt();
        int end = scn.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
