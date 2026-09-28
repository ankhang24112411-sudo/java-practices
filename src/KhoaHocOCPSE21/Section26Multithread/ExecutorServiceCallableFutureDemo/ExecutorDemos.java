package KhoaHocOCPSE21.Section26Multithread.ExecutorServiceCallableFutureDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemos {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));
        es.execute(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));

    }
}