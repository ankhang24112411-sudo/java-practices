package TuHoc.Multithread.tayjava.CountervaTestThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class ExecutorServiceImpl {

   public static void main(String[] args) {
       ExecutorService executor = Executors.newFixedThreadPool(3);
       for(int i = 0 ; i < 1000;i++){
           executor.submit(() -> {
               System.out.println("Thread " + Thread.currentThread().getName() + "is running");
           });
       }
       executor.shutdown();
    }

    }
class Counter2 {
    private int count = 0;

    // Đồng bộ hóa phương thức, chỉ giải phóng tài nguyên sau khi hàm này chạy xong
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}