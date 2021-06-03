package LevelOne.gettingStarted;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int dividend = a;
        int divisor = b;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        int gcd = divisor;

        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
