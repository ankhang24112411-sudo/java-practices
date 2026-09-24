package TuHoc.Multithread.tayjava.bai1;

import TuHoc.Multithread.tayjava.CountervaTestThread.TestThread;
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i< 10 ; i++){
            System.out.println("Toi la implement" + i);

        }
    }
}
public class TaoThread extends Thread {
    @Override
    public void run(){
        for(int i = 0 ; i< 10; i++){
            System.out.println("Toi la extend" + i);
        }
    }
   public static void main(String[] args) {
      Thread t1 = new TaoThread();
      t1.setName("Thread extend");
      t1.start();

      Runnable task = new MyRunnable();
      Thread t2 = new Thread(task);
      t2.setName("toi la runnable");
      t2.start();
      Thread t3 = new Thread(() -> {
          for(int i = 0 ; i< 10; i++){
              System.out.println("Toi la lambda" + i);
          }
      });
      t3.start();
    }
}
