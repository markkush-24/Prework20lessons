package homework4;

public class HomeWork1 {
    public static void main(String[] args) {
        String array = "сегодня Я попытался сделать домашнюю работу по проГраммироВанию";
        String upper = array.toUpperCase();
        String glasnie = "УЕАОЭЯИЮ";
        int size = upper.length();
        for (int i = 0; i < size; i++) {
            char position = upper.charAt(i);
            int index = glasnie.indexOf(position);
            if (index >= 0) {
                System.out.println(position);

            }

        }
    }
}
