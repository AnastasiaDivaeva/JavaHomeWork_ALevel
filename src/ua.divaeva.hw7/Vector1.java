package ua.divaeva.hw7;

import java.util.Arrays;

public class Vector1 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(10.0, 11.0, 4.0);
        Vector vector2 = new Vector(30.0, 31.0, 32.0);
        System.out.println("Vector1");
        System.out.println("VectorLength: " + vector1.vectorLength());
        System.out.println("productOfVectors: " + vector1.productOfVectors(vector2));
        System.out.println("cosOfVectorsAngle: " + vector1.cosOfVectorsAngle(vector2));
        System.out.println("differencesOfVector: " + vector1.differencesOfVector(vector2));
        System.out.println("sumOfVectors: " + vector1.sumOfVectors(vector2));
        Vector[] result = Vector.generateRandomVectorsArray(6);
        System.out.println("sumOfVectors: " );

    }

}
