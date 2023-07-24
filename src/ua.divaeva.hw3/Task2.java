package ua.divaeva.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] words = userInput.split(" ");
        int length = words.length;
        System.out.println("number of words = " + length);
    }
}
