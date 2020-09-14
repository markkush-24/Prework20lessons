package lesson10;

public class Slon extends Animal implements AnimalsForZoo{

    @Override
    public void voice() {
        System.out.println("ссссссс");
    }

    @Override
    public void jump() {
        System.out.println("Слон прыгает");
    }


}
