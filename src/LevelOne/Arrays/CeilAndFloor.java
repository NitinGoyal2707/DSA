package LevelOne.Arrays;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int ceil = 0;
        int floor = 0;
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > a[mid]) {
                lo = mid + 1;
                floor = a[mid];
            } else if (data < a[mid]) {
                hi = mid - 1;
                ceil = a[mid];
            } else {
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
