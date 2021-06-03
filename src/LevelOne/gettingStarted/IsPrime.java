package LevelOne.gettingStarted;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        int i = 0;
        while (i < t) {
            int num = scn.nextInt();

            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            i++;
            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
