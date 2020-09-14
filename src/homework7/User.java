package homework7;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String email;
    private Date registrationDate;
    private Feedback [] feedbacksFromUser = new Feedback[1000];

    public User() {
    }

    public User(String userName, String email, Date registrationDate) {
        this.userName = userName;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Feedback[] getFeedbacksFromUser() {
        return feedbacksFromUser;
    }

    public void setFeedbacksFromUser(Feedback[] feedbacksFromUser) {
        this.feedbacksFromUser = feedbacksFromUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getRegistrationDate(), user.getRegistrationDate()) &&
                Arrays.equals(getFeedbacksFromUser(), user.getFeedbacksFromUser());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getUserName(), getEmail(), getRegistrationDate());
        result = 31 * result + Arrays.hashCode(getFeedbacksFromUser());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "Имя пользователя'" + userName + '\'' +
                ", email='" + email + '\'' +
                ", Дата регистрации=" + registrationDate +
                ", Отзыв=" + Arrays.toString(feedbacksFromUser) +
                '}';
    }
}
