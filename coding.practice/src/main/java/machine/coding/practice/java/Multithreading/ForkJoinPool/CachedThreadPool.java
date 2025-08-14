package machine.coding.practice.java.Multithreading.ForkJoinPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        //This method creates a thread pool that creates a new thread as needed (dynamically)
        // min: 0, max: Integer.MAXVALUE, Blocking queue size is 0 as it is not used.
        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.submit(()->{
            System.out.println("This is the async task");
        });
    }
}
