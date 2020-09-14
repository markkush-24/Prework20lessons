package lesson10;

public class Krug implements Figura,Tovar{

    private  int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2* 3.14 * radius;
    }

    @Override
    public double ploshad() {
        return 3.14 * radius * radius;
    }

    @Override
    public void by() {
        System.out.println("Кружок продан");
    }
}
