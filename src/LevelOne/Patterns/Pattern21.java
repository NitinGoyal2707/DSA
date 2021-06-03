package LevelOne.Patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n / 2 + 1) {
                st++;
            } else {
                st--;
            }
        }
    }
}
