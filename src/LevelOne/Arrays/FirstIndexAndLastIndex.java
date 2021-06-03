package LevelOne.Arrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int lo = 0;
        int hi = a.length - 1;
        int fi = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                fi = mid;
                hi = mid - 1;
            }
        }
        System.out.println(fi);

        lo = 0;
        hi = a.length - 1;
        int li = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                li = mid;
                lo = mid + 1;
            }
        }
        System.out.println(li);
    }
}
