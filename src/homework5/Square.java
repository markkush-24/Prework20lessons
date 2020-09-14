package homework5;

public class Square {

    private   int area;
    private   int numberOfCorners;
    private   String producedBy;


    public Square(){

    }


    public Square(int area,int numberOfCorners,String producedBy){

    }

    public Square(String producedBy,int numberOfCorners){

    }

    public Square(int numberOfCorners,String producedBy){

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
