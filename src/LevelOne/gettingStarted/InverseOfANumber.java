package LevelOne.gettingStarted;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;
        int plc = 1;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            inv = inv + plc * (int) Math.pow(10, d - 1);
            plc++;
        }
        System.out.println(inv);
    }
}
