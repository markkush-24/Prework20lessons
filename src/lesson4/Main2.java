package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String emailFromUser = "jkhfj@shjhfuuh.hjg";
        int idexOfAt = emailFromUser.indexOf("@");
        if (idexOfAt == -1) {
            System.out.println("Это не почта , нет собачки! ");
            return;
        }
        String[] textBeforeAndAfterAt = emailFromUser.split("@");
        if (textBeforeAndAfterAt[0].length() > 5) {
            System.out.println("Это не почта.Меньше 1 символа До собачки");
            return;
        }
        int idexOftochka = textBeforeAndAfterAt[1].indexOf(".");
        if (idexOftochka == -1) {
            System.out.println("Это не почта.Нет точки");
            return;
        }

        System.out.println("Почита нам подходит");


    }
}



