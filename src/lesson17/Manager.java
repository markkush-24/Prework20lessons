package lesson17;

public class Manager {
    public static void main(String[] args) {
        Thread.currentThread().setName("Иван Иваныч");
        System.out.println(Thread.currentThread().getName() + "Начали концерт");


        Pevets1 pevets1 = new Pevets1();
        Pevets2 pevets2 = new Pevets2();
        pevets2.setDaemon(true);
        pevets1.start();
        pevets2.start();


        while (pevets1.isAlive()) {

        }
        System.out.println("Закончили концерт");
    }

}
