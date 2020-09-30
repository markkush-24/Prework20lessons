package lesson17;

public class Pevets2 extends Thread {
    @Override
    public void run() {


        while (true) {
            synchronized (Monitors.MIKE) {
                try {
                    Monitors.MIKE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("FA---------");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (Monitors.MIKE) {
                Monitors.MIKE.notify();
            }

        }
    }
}
