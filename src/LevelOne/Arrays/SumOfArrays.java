package LevelOne.Arrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a1 = scn.nextInt();

        int[] ar1 = new int[a1];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scn.nextInt();
        }
        int a2 = scn.nextInt();

        int[] ar2 = new int[a2];

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scn.nextInt();
        }
        int[] sum = new int[a1 > a2 ? a1 : a2];

        int i = ar1.length - 1;
        int j = ar2.length - 1;
        int k = sum.length - 1;

        int c = 0;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d = d + ar1[i];
            }
            if (j >= 0) {
                d = d + ar2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.print(c + " ");
        }
        for (int ans : sum) {
            System.out.print(ans + " ");
        }
    }
}
