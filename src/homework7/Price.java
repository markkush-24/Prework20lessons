package homework7;

import java.util.Objects;

public class Price {
    private double cost;
    private double discount;

    public Price() {
    }

    public Price(double cost, double discount) {
        this.cost = cost;
        this.discount = discount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice(){return cost - discount;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;
        Price price = (Price) o;
        return Double.compare(price.getCost(), getCost()) == 0 &&
                Double.compare(price.getDiscount(), getDiscount()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getDiscount());
    }

    @Override
    public String toString() {
        return "Price{" +
                "cost=" + cost +
                ", discount=" + discount +
                '}';
    }


}
