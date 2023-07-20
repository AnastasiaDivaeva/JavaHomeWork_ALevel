public class Task2 {
    public static void task1(int x1, int y1, int x2, int y2, int x3, int y3) {
        int S = ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
        System.out.println("S = " + S);
    }

    public static void task2(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Even number");
        } else {
            System.out.println(number + " Noy even ");
        }
    }

    public static void task3(double num1, double num2, double num3) {
        double minNumber = Math.min(num1, num2);
        double minNum = Math.min(minNumber, num3);
        System.out.println(minNum);
    }


    public static void main(String[] args) {
        task1(1, 5, 3, 5, 6, 7);
        task2(56);
        task3(66.2, 99.8, 95.3);
    }
}
