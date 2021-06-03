package LevelOne.Arrays;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int[] inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int val = a[i];

            inv[val] = i;
        }
        for (int an : inv) {
            System.out.println(an + " ");
        }

    }

}
