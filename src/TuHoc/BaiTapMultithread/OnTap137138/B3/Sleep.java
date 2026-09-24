package TuHoc.BaiTapMultithread.OnTap137138.B3;

public class Sleep {
   public static void main(String[] args) throws InterruptedException {


       Thread worker = new Thread(() -> {
           System.out.println("A");
       }, "worker");

       worker.start();

       worker.sleep(2000);

       System.out.println("B");
   }
}
