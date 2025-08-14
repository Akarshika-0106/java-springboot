package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            try{
                Thread.sleep(30000);
            }catch (Exception e){

            }
            System.out.println(System.currentTimeMillis()+" Task completed");
        });
        pool.shutdownNow();
        System.out.println(System.currentTimeMillis()+" Main thread completed");
    }
}
