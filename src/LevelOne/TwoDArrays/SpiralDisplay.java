package LevelOne.TwoDArrays;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int minRow = 0;
        int minCol = 0;
        int maxRow = a.length - 1;
        int maxCol = a[0].length - 1;

        int count = 0;
        int totEle = n * m;

        while (count < totEle) {

            // left wall
            for (int i = minRow, j = minCol; i <= maxRow && count < totEle; i++) {
                System.out.println(a[i][j]);
                count++;
            }
            minCol++;

            // bottom wall
            for (int i = maxRow, j = minCol; j <= maxCol && count < totEle; j++) {
                System.out.println(a[i][j]);
                count++;
            }
            maxRow--;

            // right wall
            for (int i = maxRow, j = maxCol; i >= minRow && count < totEle; i--) {
                System.out.println(a[i][j]);
                count++;
            }
            maxCol--;

            // top wall
            for (int i = minRow, j = maxCol; j >= minCol && count < totEle; j--) {
                System.out.println(a[i][j]);
                count++;
            }
            minRow++;
        }
    }
}
