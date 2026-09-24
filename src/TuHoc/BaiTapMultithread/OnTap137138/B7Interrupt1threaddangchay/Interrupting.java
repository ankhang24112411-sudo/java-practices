package TuHoc.BaiTapMultithread.OnTap137138.B7Interrupt1threaddangchay;

public class Interrupting {
    static void main() {

        Thread worker = new Thread(() -> {
            try {
                System.out.println("Working...");
                Thread.sleep(10_000);
                System.out.println("Finished");
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        });
        worker.start();
        Runnable interrupt = worker::interrupt;

        Thread interuptor = new Thread(interrupt);
        interuptor.start();

    }
}

