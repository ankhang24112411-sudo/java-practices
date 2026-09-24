package TuHoc.BaiTapMultithread.w3s.FindEvenAndOdd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// https://www.w3resource.com/java-exercises/thread/java-thread-exercise-2.php
public class Main {
    private static final int MAX_NUMBER = 50;
    private static Lock lock = new ReentrantLock();
    private static boolean isEvenTurn = true;
   public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for(int i = 2; i < MAX_NUMBER; i+=2){
                synchronized (lock){
                    while(!isEvenTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("My even num :" + i);
                    isEvenTurn = false;
                    lock.notify();
                }
            }
        });
       Thread odd = new Thread(() -> {
           for(int i = 1; i < MAX_NUMBER; i++){
               synchronized (lock){
                   while(isEvenTurn){
                       try {
                           lock.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                   System.out.println("My odd num :" + i);
                   isEvenTurn = true;
                   lock.notify();
               }
           }
       });
      even.start();
      odd.start();
    }

}
