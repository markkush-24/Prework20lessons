package homework3;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 4, 3, 4, 6};
        int maxNumbers = numbers [0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumbers) {
                maxNumbers = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное значение:" + maxNumbers);
    }
}