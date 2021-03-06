package LevelOne.TwoDArrays;

import java.util.Scanner;

public class ExitPointOfMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        exitPoint(a);
    }

    public static void exitPoint(int[][] a) {
        int dir = 0;
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + a[i][j]) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                i--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
