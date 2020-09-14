package homework2;

public class homework3 {
    public static void main(String[] args) {
        int a = 21;

        if (a > 0 && a < 18) {
            System.out.println("Это несовершенолетний слюнтяй");
        }
        if ((a >= 18 && a < 30)) {
            System.out.println("Завидую молодому ублюдку");
        }
        if (a >= 30 && a <= 60) {
            System.out.println("До пенсии еще дожить надо");
        }
        if ((a > 60 && a <= 110)) {
            System.out.println("Собирай на гробик");
        }
        if ((a <= 0 || a > 110)) {
            System.out.println("Тут тебе не Бенжамин Баттон, не заливай");
        }
    }
}