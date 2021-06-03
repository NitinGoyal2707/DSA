package LevelOne.Arrays;

import java.util.Scanner;

public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int cs = a[0];
        int ms = a[0];
        int s = 0;
        int start = 0;
        int end = 0;

        for (int i = 1; i < a.length; i++) {
            if (cs < 0) {
                cs = a[i];

            } else {
                cs = cs + a[i];

            }
            if (cs > ms) {
                ms = cs;
                end = i;
                start = s;
            }
            if (cs < 0) {
                cs = 0;
                s = 1 + i;
            }
        }
        System.out.println(ms);
        System.out.println(start);
        System.out.println(end);

    }
}
