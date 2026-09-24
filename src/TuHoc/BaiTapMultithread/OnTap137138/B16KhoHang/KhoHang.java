package TuHoc.BaiTapMultithread.OnTap137138.B16KhoHang;

public class KhoHang {

        private int stock = 1;

        public synchronized boolean buy() {

            if (stock > 0) {

                // cố tình làm race dễ xuất hiện
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                stock--;
                return true;
            }

            return false;
        }

  public   static void main(String[] args) {
            KhoHang kho = new KhoHang();
        Thread a = new Thread(() -> {
            if (kho.buy()) {
                System.out.println("a can buy it");
            }
            else {
                System.out.println("a not buy it");

            }
        });
        Thread b = new Thread(() -> {
            if (kho.buy()) {
                System.out.println("b can buy it");
            }
            else {
                System.out.println("b not buy it");

            }
        });
        a.start();
        b.start();
    }
}
