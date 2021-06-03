package LevelOne.TwoDArrays;

import java.util.Scanner;

public class Rotate2DArrayBy90 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        // Transpose
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse rows one by one
        for (int i = 0; i < a.length; i++) {
            int li = 0;
            int ri = a[i].length - 1;

            while (li < ri) {
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;
                li++;
                ri--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
