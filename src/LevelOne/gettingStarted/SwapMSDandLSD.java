package LevelOne.gettingStarted;

import java.util.Scanner;

public class SwapMSDandLSD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int temp = n;
        int dc = 0;

        while (temp > 0) {
            temp = temp / 10;
            dc++;
        }
        int p1 = 1;
        int p2 = (int) Math.pow(10, dc - 1);
        int ans = 0;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            if (p1 == 1) {
                ans = ans + d * p2;
            } else if (p1 == p2) {
                ans = ans + d;
            } else {
                ans = ans + d * p1;
            }
            p1 = p1 * 10;
        }
        System.out.println(ans);
    }
}
