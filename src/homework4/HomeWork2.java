package homework4;

public class HomeWork2 {
    public static void main(String[] args) {
        String emailFromUser = "kfsdf3425FFsgdsd";
        String numbers = "0123456789";
        int size = emailFromUser.length();
        if (size <= 8) {
            System.out.println("Пароль не подходит!Менее 7 символов");
            return;
        }

        String emailFromUserLowercase = emailFromUser.toLowerCase();
        boolean anyUpCase = emailFromUser.equals(emailFromUserLowercase);
        if (anyUpCase == true) {
            System.out.println("Добавьте заглавную букву!");

        }

        for (int i = 0; i < emailFromUser.length(); i++) {
            char simbols = emailFromUser.charAt(i);
            int simbols2 = numbers.indexOf(simbols);
            if (simbols2 >= 0) {
                System.out.println("Пароль содержит цифру!");
                return;
            }

        }
        System.out.println("Пароль не подходит!");

    }

}

