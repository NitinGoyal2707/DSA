package LevelOne.gettingStarted;

import java.util.Scanner;

public class PrintNumberInReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        while (number != 0) {
            int value = number % 10;
            System.out.println(value);
            number = number / 10;
        }
    }
}
