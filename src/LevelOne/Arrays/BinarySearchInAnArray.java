package LevelOne.Arrays;

import java.util.Scanner;

public class BinarySearchInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                System.out.println(mid);
                return;
            }

        }
        System.out.println(-1);
    }
}
