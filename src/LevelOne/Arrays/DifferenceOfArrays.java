package LevelOne.Arrays;

import java.util.Scanner;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();

        int[] a2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[n2];

        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = ans.length - 1;

        while (k >= 0) {
            int d = 0;

            int a1v = i >= 0 ? a1[i] : 0;

            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            ans[k] = d;
            i--;
            j--;
            k--;

        }
        int idx = 0;
        while (idx < ans.length) {
            if (ans[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < ans.length) {
            System.out.println(ans[idx]);
            idx++;
        }

    }
}
