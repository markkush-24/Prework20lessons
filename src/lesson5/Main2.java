package lesson5;

public class Main2 {
    public static void main(String[] args) {
        String password = "mark1234";

        String numbers = "0123456789";

        for (int i = 0; i <password.length() ; i++) {
            char currentChar = password.charAt(i);
            int indexNumber = numbers.indexOf(currentChar);
            if(indexNumber >= 0 ){
                System.out.println("Пароль содержит число!");
                return;
            }

        }
        System.out.println("В пароле нет чисел!");
    }
}
