package LevelOne.gettingStarted;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("Sum of " + n + " is " + sum);
    }
}
