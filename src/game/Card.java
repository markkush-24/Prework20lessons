package game;

import java.util.Objects;

public class Card {
    private String  nameCard;
    private int value;

    public Card() {
    }

    public Card(String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getValue() == card.getValue() &&
                Objects.equals(getNameCard(), card.getNameCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameCard(), getValue());
    }

    @Override
    public String toString() {
        return "Card{" +
                "nameCard='" + nameCard + '\'' +
                ", value=" + value +
                '}';
    }
}
