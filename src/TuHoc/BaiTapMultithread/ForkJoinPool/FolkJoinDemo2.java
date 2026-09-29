package TuHoc.BaiTapMultithread.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

public class FolkJoinDemo2 {
   public static void main(String[] args) {
        var pool = new ForkJoinPool();
        var result = pool.invoke(new DefaultRecursiveAction(40));
        System.out.println("Result: " +result);
    }
}
