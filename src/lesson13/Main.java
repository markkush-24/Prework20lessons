package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        Coin coin = new Coin("Золото",1900 , 1 ,2.5);
                coins.add(coin);
        coins.add(new Coin("Золото", 1650, 20, 2.5));
        coins.add(new Coin("Золото", 1650, 20, 2.5));
        coins.add(new Coin("Серебро", 1850, 20, 2.5));
        coins.add(new Coin("Бронза", 1750, 25, 2.5));
        coins.add(new Coin("Золото", 1600, 10, 2));

        for (Coin coin1: coins){
            System.out.println(coin);
        }
    }
}
