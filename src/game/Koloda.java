package game;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {


    private ArrayList<Card>cards = new ArrayList<>();


    public Koloda() {
        cards.add(new Card("Двойка терфа",2));
        cards.add(new Card("Двойка бубна",2));
        cards.add(new Card("Двойка черви",2));
        cards.add(new Card("Двойка пика",2));

        cards.add(new Card("Тройка терфа",3));
        cards.add( new Card("Тройка бубна",3));
        cards.add( new Card("Тройка черви",3));
        cards.add(new Card("Тройка пика",3));

        cards.add( new Card("Четверка терфа",4));
        cards.add( new Card("Четверка бубна",4));
        cards.add( new Card("Четверка черви",4));
        cards.add( new Card("Четверка пика",4));

        cards.add( new Card("Пятерка терфа",5));
        cards.add( new Card("Пятерка бубна",5));
        cards.add( new Card("Пятерка черви",5));
        cards.add( new Card("Пятерка пика",5));

        cards.add( new Card("Шестерка терфа",6));
        cards.add( new Card("Шестерка бубна",6));
        cards.add(new Card("Шестерка черви",6));
        cards.add( new Card("Шестерка пика",6));

        cards.add(new Card("Семерка терфа",7));
        cards.add( new Card("Семерка бубна",7));
        cards.add( new Card("Семерка черви",7));
        cards.add( new Card("Семерка пика",7));

        cards.add( new Card("Восьмерка терфа",8));
        cards.add( new Card("Восьмерка бубна",8));
        cards.add( new Card("Восьмерка черви",8));
        cards.add( new Card("Восьмерка пика",8));

        cards.add(new Card("Девятка терфа",9));
        cards.add( new Card("Девятка бубна",9));
        cards.add( new Card("Девятка черви",9));
        cards.add( new Card("Девятка пика",9));

        cards.add( new Card("Десятка терфа",10));
        cards.add( new Card("Десятка бубна",10));
        cards.add( new Card("Десятка черви",10));
        cards.add( new Card("Десятка пика",10));

        cards.add( new Card("Туз терфа",11));
        cards.add( new Card("Туз бубна",11));
        cards.add( new Card("Туз черви",11));
        cards.add( new Card("Туз пика",11));

        cards.add( new Card("Король терфа",4));
        cards.add( new Card("Король бубна",4));
        cards.add( new Card("Король черви",4));
        cards.add( new Card("Король пика",4));

        cards.add( new Card("Дама терфа",3));
        cards.add( new Card("Дама бубна",3));
        cards.add( new Card("Дама черви",3));
        cards.add( new Card("Дама пика",3));

        cards.add( new Card("Волет терфа",2));
        cards.add( new Card("Волет бубна",2));
        cards.add( new Card("Волет черви",2));
        cards.add( new Card("Волет пика",2));
    }

    public Card getRandomCart(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return  cards.get(randomNum);

    }

}

