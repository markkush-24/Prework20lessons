package homework5;

public class Triangle {


    private int area;
    private int numberOfSides;
    private String producedBy;


    public Triangle() {

    }


    public Triangle(int area, int numberOfSides, String producedBy) {
        this.area = area;
        this.numberOfSides = numberOfSides;
        this.producedBy = producedBy;
    }

    public Triangle(String producedBy, int numberOfSides) {

        this.numberOfSides = numberOfSides;
        this.producedBy = producedBy;
    }

    public Triangle(int numberOfSides, String producedBy) {

        this.numberOfSides = numberOfSides;
        this.producedBy = producedBy;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }
}
