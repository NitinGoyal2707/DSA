package LevelOne.gettingStarted;

import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long number = scn.nextLong();
        long digitCounter = 0;
        while (number != 0) {
            number = number / 10;
            digitCounter++;
        }
        System.out.println(digitCounter);
    }
}
