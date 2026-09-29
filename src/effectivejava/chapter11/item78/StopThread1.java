package effectivejava.chapter11.item78;

import java.util.concurrent.TimeUnit;

public class StopThread1 {
    private static boolean stopRequested;
    // read and write should participate in synchronization
    private static synchronized void requestStop(){
        stopRequested = true;
    }
    private static synchronized boolean stopWasRequested(){
        return stopRequested;
    }
    public static void main(String[] args)
            throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
            int i = 0;

            while (!stopWasRequested())
                i++;
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);

        requestStop();
    }
}
