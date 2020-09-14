package lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.putProduct("Яблоко",2);
        holodilnik.putProduct("Груша",1);
        holodilnik.putProduct("Слива",3);
        holodilnik.putProduct("Яблоко",4);
        holodilnik.printAllProdukts();

        holodilnik.PrintAllNetto();
    }
}
