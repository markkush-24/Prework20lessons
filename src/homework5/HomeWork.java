package homework5;

public class HomeWork {
    public static void main(String[] args) {
        Triangle specification2 = new Triangle(9,3,"Mark");
        Triangle specification3 = new Triangle();
        Triangle specification4 = new Triangle();
        System.out.println(specification2.getNumberOfSides());
        System.out.println(specification2.getArea());

        specification2.setNumberOfSides(9);
        specification2.setArea(27);
        System.out.println(specification2.getNumberOfSides() + specification2.getArea());


    }
}
