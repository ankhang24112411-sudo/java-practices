package TuHoc.Multithread.tayjava.CountervaTestThread;

public class TestThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("TestThread is running" + i);
        }
    }

   public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
    }
}
