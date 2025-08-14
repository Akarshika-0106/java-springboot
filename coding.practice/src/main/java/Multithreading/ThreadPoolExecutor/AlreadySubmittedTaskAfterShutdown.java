package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AlreadySubmittedTaskAfterShutdown {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            try{
                Thread.sleep(5000);
            }catch (Exception e){

            }
            System.out.println("Task completed");
        });

        pool.shutdown();
        System.out.println("Main thread completed");
    }
}
