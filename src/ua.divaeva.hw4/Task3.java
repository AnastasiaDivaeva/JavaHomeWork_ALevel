package ua.divaeva.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] inputRandomValues = new int[2000];
        Random random = new Random();
        int minValue = 1;
        int maxValue = 2000;

        for (int i = 0; i < inputRandomValues.length; i++) {
            inputRandomValues[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        for (int i = 0; i < inputRandomValues.length; i++) {
            if (inputRandomValues[i] % 2 == 0) {
                inputRandomValues[i] = 0;
            }
        }

        for (int inputRandomValue : inputRandomValues) {
            System.out.print(inputRandomValue + " ");
        }
    }
}

