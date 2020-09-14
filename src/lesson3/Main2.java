package lesson3;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 150; i++) {
            if (i >= 100 && i <= 120 || i >= 130 && i <= 150) {

                System.out.println(i);
            }
        }
    }
}