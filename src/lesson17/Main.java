package lesson17;

public class Main {
    public static void main(String[] args) {
                Thread nextThread = new Thread(new NextThread());
        for(int i = 0; i < 10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
