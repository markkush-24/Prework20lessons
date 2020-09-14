package lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main1 {
    public static void main(String[] args) {
        String password = "mark1234";
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (currentChar == '0' || currentChar == '1' || currentChar == '2' || currentChar == '3' || currentChar == '4' || currentChar == '5' || currentChar == '6' || currentChar == '7' || currentChar == '8' || currentChar == '9') {
            }
            System.out.println("Пароль подходит");
            break;
        }

        System.out.println("В пароле нет цифр!");
    }


}





