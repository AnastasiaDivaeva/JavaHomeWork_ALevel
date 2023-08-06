package ua.divaeva.hw7;

import java.util.Random;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        double powerOfX = Math.pow(x, 2);
        double powerOfY = Math.pow(y, 2);
        double powerOfZ = Math.pow(z, 2);
        return Math.sqrt(powerOfZ + powerOfY + powerOfX);
    }

    public Vector productOfVectors(Vector other) {
        double resultX = (y * other.z - z * other.y);
        double resultZ = (z * other.y - y * other.z);
        double resultY = (x * other.y - y * other.x);
        return new Vector(resultX, resultY, resultZ);
    }

    public double cosOfVectorsAngle(Vector other) {
        double scalarProductOfVectors = (x * other.x + y * other.y + z * other.z);
        double powerOfX = Math.pow(x, 2);
        double powerOfY = Math.pow(y, 2);
        double powerOfZ = Math.pow(z, 2);
        double powerOfOtherX = Math.pow(other.x, 2);
        double powerOfOtherY = Math.pow(other.y, 2);
        double powerOfOtherZ = Math.pow(other.z, 2);
        double vectorModulesFirst = Math.sqrt(powerOfZ + powerOfY + powerOfX);
        double vectorModulesOther = Math.sqrt(powerOfOtherZ + powerOfOtherY + powerOfOtherX);
        double vectorModules = vectorModulesFirst * vectorModulesOther;
        return scalarProductOfVectors / vectorModules;
    }

    public Vector sumOfVectors(Vector other) {
        double sumVectorX = x + other.x;
        double sumVectorY = y + other.y;
        double sumVectorZ = z + other.z;
        return new Vector(sumVectorX, sumVectorY, sumVectorZ);
    }

    public Vector differencesOfVector(Vector other) {
        double diffVectorX = x - other.x;
        double diffVectorY = y - other.y;
        double diffVectorZ = z - other.z;
        return new Vector(diffVectorX, diffVectorY, diffVectorZ);
    }

    public static Vector[] generateRandomVectorsArray(int size) {
        Vector[] result = new Vector[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int x = random.nextInt();
            int y = random.nextInt();
            int z = random.nextInt();
            result[i] = new Vector(x, y, z);
        }
        return result;

    }

}

