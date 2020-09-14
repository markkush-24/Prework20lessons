package lesson10;

public class Tiger extends Animal implements AnimalsForZoo{

    @Override
    public void voice() {
        System.out.println("ррррррррр");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

}
