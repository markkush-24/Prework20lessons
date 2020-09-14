package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int mark = 4;

        switch (mark){
            case 1:
                System.out.println("Ужас!");
                break;
            case 2:
                System.out.println("Не очень!");
                break;
            case 3:
                System.out.println("Пойдет");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 5:
                System.out.println("Отлично!");
                break;

            default:
                System.out.println("Это не оценка!");
                break;
        }
    }
}
