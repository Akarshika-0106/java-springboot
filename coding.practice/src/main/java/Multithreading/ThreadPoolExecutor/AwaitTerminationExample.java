package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) {
        // It is an optional functionality which returns true/false
        // It is used after calling shutdown method
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            try{
                Thread.sleep(5000);
            }catch (Exception e){

            }
            System.out.println("Task completed");
        });

        pool.shutdown();
        try{
            boolean isTerminated = pool.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println(" Is terminated?: "+isTerminated);
        }catch (Exception e){

        }

        System.out.println("Main thread completed");
    }
}
