package TuHoc.BaiTapMultithread.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

public class FolkJoinDemo {
    static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        ForkJoinPool forkJoinPool2 = new ForkJoinPool();

        forkJoinPool2.invoke(new DefaultRecursiveAction(32));
    }
}
