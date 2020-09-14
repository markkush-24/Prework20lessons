package lesson8;

public class Main {
    public static void main(String[] args) {
        Krug krug = new Krug(5);
     double pirimetr =  krug.pirimetr();
        System.out.println(pirimetr);


        Oval oval = new Oval(3,6);
        System.out.println(oval.pirimetr());
    }
}
