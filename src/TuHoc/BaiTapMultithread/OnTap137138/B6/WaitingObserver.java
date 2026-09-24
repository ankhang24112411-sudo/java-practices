package TuHoc.BaiTapMultithread.OnTap137138.B6;

public class WaitingObserver {
    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "worker");

        worker.start();

        Thread observer = new Thread(() -> {
            try {
                worker.join(); // observer đứng chờ worker
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "observer");

        observer.start();

        // Cho observer chút thời gian để chạy tới worker.join()
        Thread.sleep(100);

        System.out.println("worker: " + worker.getState());
        System.out.println("observer: " + observer.getState());

    }
}
