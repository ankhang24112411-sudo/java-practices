package effectivejava.chapter11.item78.brokencase;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static volatile boolean stopRequested;
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            if (!stopRequested) {
                while (true) {
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(3);
        stopRequested = true;
    }
}
