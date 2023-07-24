package ua.divaeva.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        StringBuilder result = new StringBuilder();

        char[] userInputArray = userInput.toCharArray();
        for (char symbol : userInputArray) {
            if (symbol != ' ') {
                result.append(symbol);
            }
        }

        System.out.println(result);

        if (isPalindrome(result.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
