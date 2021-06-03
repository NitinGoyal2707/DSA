package LevelOne.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();
        toh(n, t1, t2, t3);
    }

    public static void toh(int n, int tow1, int tow2, int tow3) {
        if (n == 0) {
            return;
        }
        toh(n - 1, tow1, tow3, tow2);
        System.out.println(n + "[" + tow1 + " -> " + tow2+"]");
        toh(n-1, tow3, tow2, tow1);
    }
}
