package codingpractice.Multithreading.ForkJoinPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {
    public static void main(String[] args) {
        //fixed thread pool executor
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        threadPool.submit(() ->{
            System.out.println("This is the async task");
        });
    }
}
