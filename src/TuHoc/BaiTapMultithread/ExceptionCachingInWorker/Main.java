package TuHoc.BaiTapMultithread.ExceptionCachingInWorker;

public class Main {
    static void main(String[] args) {
        Thread worker = new Thread(() -> {

            System.out.println("working");

            throw new RuntimeException("BOOM");
        });

        worker.setUncaughtExceptionHandler((thread, error) -> {
            System.out.println(
                    thread.getName() + ": " + error.getMessage()
            );
        });
    }
}
