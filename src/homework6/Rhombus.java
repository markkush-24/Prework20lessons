package homework6;

public class Rhombus extends Rectangle {
    private double highOfRhombus;

    public Rhombus() {
    }

    public Rhombus(double side1, double highOfRhombus) {
        super(side1);
        this.highOfRhombus = highOfRhombus;
    }

    @Override
    public double area() {
        return highOfRhombus * side1;
    }
}
