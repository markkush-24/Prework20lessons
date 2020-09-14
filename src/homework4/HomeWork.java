package homework4;

public class HomeWork {
    public static void main(String[] args) {
        String password = "доагнуеттиогюпоартвдс";
        int number = password.length() - 1;
        String glasnie = "уеаоюэяи";
        for (int i = number; i >= 0; i--) {
            char words = password.charAt(i);
            int index = glasnie.indexOf(words);
            if (index >= 0) {
                System.out.println(words);

            }
        }
    }
}
