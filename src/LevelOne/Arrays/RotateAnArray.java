package LevelOne.Arrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(a, k);
        display(a);

    }

    public static void display(int[] a) {
        for (int dis : a) {
            System.out.print(dis + " ");
        }
    }

    public static void reverse(int[] a, int li, int ri) {
        int i = li;
        int j = ri;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;

        k = k % n;
        if (k < 0) {
            k = k + n;
        }

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);


    }
}
