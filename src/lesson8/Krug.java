package lesson8;

import java.util.Objects;

public class Krug {

    protected double radius;

    public Krug(){

    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double pirimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Krug)) return false;
        Krug krug = (Krug) o;
        return Double.compare(krug.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
