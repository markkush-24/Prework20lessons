package homework5;

public class Oval {


    private   int area;
    private   int numberOfVertices;
    private   String kindOfOval;


    public Oval(){

    }


    public Oval(int area,int numberOfVertices,String kindOfOval){

    }

    public Oval(String kindOfOval,int numberOfVertices){

    }

    public Oval(int numberOfVertices,String kindOfOval){

    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int numberOfVertices() {
        return numberOfVertices;
    }

    public void numberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public String getKindOfOval() {
        return kindOfOval;
    }

    public void setKindOfOval(String kindOfOval) {
        this.kindOfOval = kindOfOval;
    }
}
