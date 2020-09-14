package homework3;

public class HomeWork6 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {2, 4, 3, 4, 6, 4, 6, 7, 5, 6, 7};
        for (int i = 0; i <= 10; i++) {
            if (numbers[i] % 2 != 0) {
                sum = sum + numbers[i];
            }

        }
        System.out.println(sum);
    }
}