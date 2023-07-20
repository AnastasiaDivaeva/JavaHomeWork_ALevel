
public class Work2 {
    public static void main(String[] args) {
        int[] numeral = new int[]{3, 4, 5, 6} ;
        int sum = 0;

        for (int i : numeral) {
            sum += i;
        }


        System.out.println(sum);
        System.out.println(numeral.length);
        System.out.println((double) sum / numeral.length);

        String[] letters;
        letters = new String[4];
        System.out.println(letters.length);
    }
}
