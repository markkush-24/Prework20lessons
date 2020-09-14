package lesson13;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    String material;
    int year;
    int nominal;
    double diametr;

    public Coin(String material) {
        this.material = material;
    }

    public Coin(String material, int year, int nominal, double diametr) {
        this.material = material;
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return getYear() == coin.getYear() &&
                getNominal() == coin.getNominal() &&
                Double.compare(coin.getDiametr(), getDiametr()) == 0 &&
                Objects.equals(getMaterial(), coin.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial(), getYear(), getNominal(), getDiametr());
    }

    @Override
    public String toString() {
        return "Coin{" +
                "material='" + material + '\'' +
                ", year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                '}';
    }

    @Override
    public int compareTo(Coin coin) {
        if (this.getYear() != coin.getYear()) {
            return this.getYear() - coin.getYear();
        }
        if (this.getNominal() != coin.getNominal()) {
            return this.getNominal() - coin.getNominal();
        }
        if (this.getDiametr() != coin.getDiametr()) {
            return Double.compare(this.getDiametr(), coin.getDiametr());
        }
        return this.getMaterial().compareTo(coin.getMaterial());
    }
}
