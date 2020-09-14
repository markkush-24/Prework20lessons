package homework7;

import java.util.Arrays;
import java.util.Objects;

public class Tovar extends Price{
    private String goodName;
    private Feedback[] feedback = new Feedback [1000];
    private Price actualPrice;
    private Size[] avalibleSize = new Size[3];

    public Tovar() {
    }

    public Tovar(String goodName, Feedback[] feedback, Price actualPrice, Size[] avalibleSize) {
        this.goodName = goodName;
        this.feedback = feedback;
        this.actualPrice = actualPrice;
        this.avalibleSize = avalibleSize;
    }

    public Tovar(String goodName) {
        this.goodName = goodName;
    }

    public Tovar(String goodName, Price actualPrice) {
        this.goodName = goodName;
        this.actualPrice = actualPrice;

    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Feedback[] getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback[] feedback) {
        this.feedback = feedback;
    }

    public Price getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Price actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Size[] getAvalibleSize() {
        return avalibleSize;
    }

    public void setAvalibleSize(Size[] avalibleSize) {
        this.avalibleSize = avalibleSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;
        Tovar tovar = (Tovar) o;
        return Objects.equals(getGoodName(), tovar.getGoodName()) &&
                Arrays.equals(getFeedback(), tovar.getFeedback()) &&
                Objects.equals(getActualPrice(), tovar.getActualPrice()) &&
                Arrays.equals(getAvalibleSize(), tovar.getAvalibleSize());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getGoodName(), getActualPrice());
        result = 31 * result + Arrays.hashCode(getFeedback());
        result = 31 * result + Arrays.hashCode(getAvalibleSize());
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "goodName='" + goodName + '\'' +
                ", feedback=" + Arrays.toString(feedback) +
                ", actualPrice=" + actualPrice +
                ", avalibleSize=" + Arrays.toString(avalibleSize) +
                '}';
    }
}
