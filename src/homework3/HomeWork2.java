package homework3;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 5, 6, 8, -1, 7, 56, 4, 5, 7};

        for (int i = 10; i >= 0; i--) {
            if (numbers[i] % 2 == 0){

                System.out.println(numbers[i]);

            }
        }
    }
}
