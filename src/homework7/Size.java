package homework7;

import java.util.Objects;

public class Size {
    private String sizeL;
    private String sizeM;
    private String sizeS;

    public Size() {
    }

    public Size(String sizeL, String sizeM, String sizeS) {
        this.sizeL = sizeL;
        this.sizeM = sizeM;
        this.sizeS = sizeS;
    }

    public String getSizeL() {
        return sizeL;
    }

    public void setSizeL(String sizeL) {
        this.sizeL = sizeL;
    }

    public String getSizeM() {
        return sizeM;
    }

    public void setSizeM(String sizeM) {
        this.sizeM = sizeM;
    }

    public String getSizeS() {
        return sizeS;
    }

    public void setSizeS(String sizeS) {
        this.sizeS = sizeS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Size)) return false;
        Size size = (Size) o;
        return Objects.equals(getSizeL(), size.getSizeL()) &&
                Objects.equals(getSizeM(), size.getSizeM()) &&
                Objects.equals(getSizeS(), size.getSizeS());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSizeL(), getSizeM(), getSizeS());
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeL='" + sizeL + '\'' +
                ", sizeM='" + sizeM + '\'' +
                ", sizeS='" + sizeS + '\'' +
                '}';
    }
}
