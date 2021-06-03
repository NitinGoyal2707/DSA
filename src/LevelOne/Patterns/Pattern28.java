package LevelOne.Patterns;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            int val2 = val;
            for (int j = 1; j <= i; j++) {
                System.out.print(val2 + "\t");
                val2--;
            }
            val++;
            System.out.println();
        }
    }
}
