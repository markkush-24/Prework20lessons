package homework2;

public class homework2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 5;
        int d = 4;

        if (a == b && b == c && c == d && d == a) {
            System.out.println("Это квадрат");
        }if ((a == c && d == b && a != b) || (a == b && c == d && b != c) || (a == d && b == c && c != d)) {
            System.out.println("Это прямоугольник");
        }if (a != b && b != c && c != d && d != a && a != c){
            System.out.println("Это неравносторонний четырехугольник");
        }if((a == b && c != d && a != c && a != d)||(b == c && a != d && c != d && c != a)||(c == d && a != b && d != a && d != b)

         || (d == a && b != c && d != b && d != c)){
            System.out.println("Это трапеция");
        }

    }
}
