package ua.divaeva.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 11;

        int[] inputRandomValues = new int[400];
        Random rand = new Random();

        for (int i = 0; i < inputRandomValues.length; i++) {
            inputRandomValues[i] = rand.nextInt(maxValue - minValue) + minValue;
        }

        double sum = 0;
        for (int x : inputRandomValues) {
            sum += x;
        }

        System.out.println("arithmetic average: " + (int) (sum / inputRandomValues.length));

        double geometric = 1;
        for (int x : inputRandomValues) {
            geometric *= x;
        }
        System.out.println("geometric average: " + (int) Math.sqrt(geometric));
    }
}
