package TuHoc.BaiTapMultithread.OnTap137138.NangCao.NC5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() -> {
            System.out.println("A start");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("A end");
        });

        Thread b = new Thread(() -> {
            System.out.println("B start");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("B end");
        });

        Thread c = new Thread(() -> {
            System.out.println("C");
        });
        a.start();
        a.join();

        b.start();
        b.join();
    }
}
