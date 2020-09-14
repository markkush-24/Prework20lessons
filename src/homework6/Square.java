package homework6;

import java.util.Objects;

public class Square {
    private String colorName;
    private String matherial;
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Square() {
    }

    public Square(String colorName,String matherial) {
        this.colorName = colorName;
        this.matherial = matherial;
    }


    public Square(double side1,double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }


    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public double getSide1() {
        return side1;
    }

    public String getMatherial() {
        return matherial;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getSide1(), getSide1()) == 0 &&
                Double.compare(square.getSide2(), getSide2()) == 0 &&
                Double.compare(square.getSide3(), getSide3()) == 0 &&
                Double.compare(square.getSide4(), getSide4()) == 0 &&
                getColorName().equals(square.getColorName()) &&
                getMatherial().equals(square.getMatherial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColorName(), getMatherial(), getSide1(), getSide2(), getSide3(), getSide4());
    }

    @Override
    public String toString() {
        return "Square{" +
                "colorName='" + colorName + '\'' +
                ", matherial='" + matherial + '\'' +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", side4=" + side4 +
                '}';
    }
}
