package LevelOne.Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int faith = power(x, n / 2);
        int expectation = faith * faith;
        if (n % 2 == 1) {
            expectation = x * expectation;
        }
        return expectation;
    }
}
