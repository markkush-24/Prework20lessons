package lesson10;

public class Kvadrat implements Figura,Tovar {
    int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public double perimetr() {
        return a + a + a +a;
    }

    @Override
    public double ploshad() {
        return a * a;
    }

    @Override
    public void by() {
        System.out.println("Квадрат продан");
    }
}
