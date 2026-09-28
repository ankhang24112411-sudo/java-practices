package KhoaHocOCPSE21.Section26Multithread.ExecutorServiceCallableFutureDemo;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class EsCallableFuture {
    public static void main(String[] args) throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(4);

        List<Integer> numbers = IntStream
                .rangeClosed(1, 100)
                .boxed()
                .toList();
        Callable<Integer> task1 = (() -> calculate(1,25));
        Future<Integer> f1 = executor.submit( task1 );
        int res1 = f1.get();
    }
    private static int calculate(int start, int end)
            throws InterruptedException {

        System.out.println(
                Thread.currentThread().getName()
                        + " calculating "
                        + start + " -> " + end
        );

        // giả lập task mất thời gian
        Thread.sleep(2000);

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}
