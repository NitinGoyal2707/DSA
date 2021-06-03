package LevelOne.TwoDArrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] a1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] a2 = new int[r1][c1];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a2[i][j] = scn.nextInt();
            }
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        for (int[] ints : sum) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
