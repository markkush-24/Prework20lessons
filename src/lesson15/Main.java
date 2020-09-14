package lesson15;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        try {
            people.setAge(-200);
            System.out.println("Все хорошо!");
        } catch (UncarrentAgeExeption uncarrentAgeExeption) {
            System.out.println("Не тот возраст...");
        }
        System.out.println("Программа дальше не работает");
    }
}
