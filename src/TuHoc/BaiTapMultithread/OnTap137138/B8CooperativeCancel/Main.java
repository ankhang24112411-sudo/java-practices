package TuHoc.BaiTapMultithread.OnTap137138.B8CooperativeCancel;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {

            long number = 0;
            while (!Thread.currentThread().isInterrupted()) {
                number++;
            }
            System.out.println("Stopped at " + number);
        });
        worker.start();
        Thread.sleep(1000);
        worker.interrupt();
        worker.join();
    }

}
