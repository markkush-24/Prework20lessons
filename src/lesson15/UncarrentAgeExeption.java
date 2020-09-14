package lesson15;

public class UncarrentAgeExeption extends  Exception {
    public UncarrentAgeExeption() {
    }

    public UncarrentAgeExeption(String s) {
        super(s);
    }

    public UncarrentAgeExeption(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UncarrentAgeExeption(Throwable throwable) {
        super(throwable);
    }

    public UncarrentAgeExeption(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
