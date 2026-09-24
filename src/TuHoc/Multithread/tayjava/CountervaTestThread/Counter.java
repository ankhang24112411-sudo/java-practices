package TuHoc.Multithread.tayjava;

public class Counter {
    private int count = 0;

    // Đồng bộ hóa phương thức, chỉ giải phóng tài nguyên sau khi hàm này chạy xong
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

   public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread5 = new Thread(() -> {
            for (int i = 0 ; i < 1000; i++){
                counter.increment();
                System.out.println("thread5: " + counter.getCount());
            }
        });
       Thread thread6 = new Thread(() -> {
           for (int i = 0 ; i < 1000; i++){
               counter.increment();
               System.out.println("thread6: " + counter.getCount());
           }
       });
       thread5.start();
       thread6.start();
       //đợi cả 2  thread hoàn thành
       thread5.join();
       thread6.join();

       System.out.println("Final count: " + counter.getCount());
    }
}
