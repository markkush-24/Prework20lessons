package lesson15;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrtingUtils implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Один из аргументов пуст");
        }
        int num1 = 0;
        try {
            num1 = Integer.parseInt(number1);
        } catch (NumberFormatException e) {
            throw new NullPointerException("Первое значение - не число!!!");
        }
        int num2 = 0;

        try {
            num2 = Integer.parseInt(number2);
        } catch (NumberFormatException e) {
            throw new NullPointerException("Второе значение - не число!!!");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Деление на 0 нельзя!!!");

        }

        return num1 / num2;
    }

    @Override
    public Integer[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Один из аргументов пуст");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] newText = text.split(" ");
        Integer[] myArray = new Integer[0];
        for (int i = 0; i < newText.length; i++) {
            String result = newText[i];
            if (result.equals(word)) {
                arrayList.add(i);
                myArray = arrayList.toArray(new Integer[arrayList.size()]);
                System.out.println(java.util.Arrays.toString(myArray));
            }
        }

        return myArray;
    }


    @Override
    public Double[] findNumbers(String text) throws CustomException {
        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+))");
        Matcher matcher = pattern.matcher(text);
        if(!matcher.find()){
            throw new CustomException ("В тексте нет цифр");
        }
        Double[] doubles = new Double[0];
        while (matcher.find()) {
            double d = Double.parseDouble(matcher.group(1));
            ArrayList<Double> numbers = new ArrayList<>();
            numbers.add(d);
            doubles = numbers.toArray(new Double[numbers.size()]);
            System.out.println(java.util.Arrays.toString(doubles));

        }

        return doubles;
    }

    @Override
    public String toString() {
        return "SrtingUtils{}";
    }

}
