package TuHoc.BaiTapMultithread.OnTap137138.B15synchronizing;

import TuHoc.BaiTapMultithread.OnTap137138.B13RaceConditionOpening.Counter;

public class SynchronizingDemo {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    static void main(String[] args) throws InterruptedException {
        SynchronizingDemo counter = new SynchronizingDemo();
        Thread a = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        });

        Thread b = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        });

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(counter.getCount());
    }
}
