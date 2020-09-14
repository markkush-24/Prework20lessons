package lesson15;

public class SrtingUtils implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Один из аргументов пуст");
        }
        int num1 = 0;
        try {
             num1 = Integer.parseInt(number1);
        }catch (NumberFormatException e){
            throw new NullPointerException("Первое значение - не число!!!");
        }int  num2 = 0;

        try {
             num2 = Integer.parseInt(number2);
        }catch (NumberFormatException e) {
            throw new NullPointerException("Второе значение - не число!!!");
        }
        if(num2 == 0){
            throw new ArithmeticException("Деление на 0 нельзя!!!");

        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
