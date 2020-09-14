package homework7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mark", "mark@mail.ru", new Date());
        Feedback feedback = new Feedback(5, new Date(), user, "Perfect good");
        Price price = new Price(1000,150);
        double actualPrice = price.actualPrice();
        Tovar tovar = new Tovar("Trouthers for men");


        System.out.println(tovar);
    }
}
