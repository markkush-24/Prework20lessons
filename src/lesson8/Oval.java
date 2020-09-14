package lesson8;

public class Oval extends Krug {
    private double radius2;

    public Oval() {
    }

    public Oval(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    @Override
    public double pirimetr() {
        double underSquare = (radius2 * radius2 + radius * radius)/2;
        return 2 * Math.PI * Math.sqrt(underSquare);
    }
}
