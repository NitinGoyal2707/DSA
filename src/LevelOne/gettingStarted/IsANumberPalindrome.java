package LevelOne.gettingStarted;

import java.util.Scanner;

public class IsANumberPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int temp = n;
        int reversedNumber = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }
        if (reversedNumber == n) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }
    }
}
