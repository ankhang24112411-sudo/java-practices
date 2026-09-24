package TuHoc.BaiTapMultithread.OnTap137138.B13RaceConditionOpening;

public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
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


