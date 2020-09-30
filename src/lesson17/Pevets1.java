package lesson17;

public class Pevets1 extends Thread {

    private boolean needStop = false;
    int count = 0;

    @Override
    public void run() {
        while (!needStop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("---------La");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                if (count > 3) {
                    needStop = true;
                }
            }
            synchronized (Monitors.MIKE) {
                Monitors.MIKE.notify();
            }
            synchronized (Monitors.MIKE) {
                try {
                    Monitors.MIKE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
