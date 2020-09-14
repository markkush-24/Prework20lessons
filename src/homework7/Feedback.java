package homework7;

import java.util.Date;
import java.util.Objects;

public class Feedback {
    private int stars;
    private Date publishDate;
    private User user;
    private String text;

    public Feedback() {
    }

    public Feedback(int stars, Date publishDate, User user, String text) {
        this.stars = stars;
        this.publishDate = publishDate;
        this.user = user;
        this.text = text;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback)) return false;
        Feedback feedback = (Feedback) o;
        return getStars() == feedback.getStars() &&
                Objects.equals(getPublishDate(), feedback.getPublishDate()) &&
                Objects.equals(getUser(), feedback.getUser()) &&
                Objects.equals(getText(), feedback.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStars(), getPublishDate(), getUser(), getText());
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "stars=" + stars +
                ", publishDate=" + publishDate +
                ", user=" + user +
                ", text='" + text + '\'' +
                '}';
    }
}
