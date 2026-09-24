package TuHoc.BaiTapMultithread.OnTap137138.B4;

public class DieuKhienThuTuJoin {
    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            System.out.println("1");
            System.out.println("2");
        }, "worker");

        worker.start();
        worker.join();
        System.out.println("3");
    }
}
