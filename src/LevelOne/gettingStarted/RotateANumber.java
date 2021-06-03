package LevelOne.gettingStarted;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int cod = 0;
        while (temp != 0) {
            temp /= 10;
            cod++;
        }
        k = k % cod;
        if (k < 0) {
            k = k + cod;
        }

        int power = (int) Math.pow(10, k);
        int b = n % power;
        int c = n / power;

        int rotation = (int) Math.pow(10, cod - k);

        int ans = b * rotation + c;
        System.out.println(ans);

    }
}
