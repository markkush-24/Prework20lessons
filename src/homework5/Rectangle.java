package homework5;

public class Rectangle {

    private   int area;
    private   int numberOfCorners;
    private   String producedBy;


    public Rectangle(){

    }


    public Rectangle(int area,int numberOfCorners,String producedBy){

    }

    public Rectangle(String producedBy,int numberOfCorners){

    }

    public Rectangle(int numberOfCorners,String producedBy){

    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int numberOfCorners() {
        return numberOfCorners;
    }

    public void numberOfCorners(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }
}
