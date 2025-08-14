package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskSubmissionAfterShutdown {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            System.out.println("Thread is going to start its work");
        });

        pool.shutdown();

        pool.submit(() -> {
            System.out.println("Thread is going to start its work");
        });
    }
}
