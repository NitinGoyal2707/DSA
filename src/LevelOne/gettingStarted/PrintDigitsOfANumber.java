package LevelOne.gettingStarted;

import java.util.Scanner;

public class PrintDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int temporaryNumber = number;
        int digitCounter = 0;
        while (temporaryNumber != 0) {
            temporaryNumber = temporaryNumber / 10;
            digitCounter++;
        }

        //int power = (int)Math.pow(10,digitCounter-1);
        int power = 0;
        for (int i = 0; i <= digitCounter - 1; i++) {
            power = power * 10;
        }

        while (power != 0) {
            int answer = number / power;
            System.out.println(answer);
            number = number % power;
            power = power / 10;
        }
    }
}
