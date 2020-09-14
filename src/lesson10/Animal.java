package lesson10;

public abstract class Animal {

    private String name;

    public void printName() {
        System.out.println(name);
    }
    public  abstract  void voice();

    public  abstract  void jump();

}
