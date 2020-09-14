package homework9;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.putProduct("Яблоко" , 25);
        holodilnik.putProduct("Арбуз" , 15);
        holodilnik.putProduct("Киви" , 35);
        //holodilnik.getProductsInOrder();

       // holodilnik.productWithMinAmount();
       //holodilnik.productAmount("Арбуз");
        holodilnik.getMinSet(3);
    }
}
