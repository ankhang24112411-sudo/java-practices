package TuHoc.BaiTapMultithread.OnTap137138.NangCao.NC6;

public class Main {
    public static void main() throws InterruptedException {


        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Worker finished");
            } catch (InterruptedException e) {
                System.out.println("Worker interrupted");
            }
        });

        worker.start();

        worker.join(1000);
        if(worker.isAlive()){
             worker.interrupt();
        }
        worker.join();
        System.out.println("Main end");

    }

}
