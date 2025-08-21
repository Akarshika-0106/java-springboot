package codingpractice.Multithreading.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample {
    // It helps to schedule the tasks.
    // It is a child of ThreadPoolExecutor

    public static void main(String[] args) {
        ScheduledExecutorService pool1 = Executors.newScheduledThreadPool(5);
        pool1.schedule(() -> {
            System.out.println("hello");
        }, 2, TimeUnit.SECONDS);

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        pool.schedule(() -> {
            try {
                System.out.println("Task gets picked up");
                Thread.sleep(6000);
                System.out.println("Task is completed");
            } catch (Exception e){

            }
        }, 2, TimeUnit.SECONDS);

        ScheduledExecutorService pool2 = Executors.newScheduledThreadPool(5);
        Future<String> futureObj = pool2.schedule(() -> {
            return "hello";
        }, 2, TimeUnit.SECONDS);

        try{
            System.out.println(futureObj.get());
        }catch (Exception e){

        }

        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(5);
        Future<?> futureScheduled = pool3.scheduleAtFixedRate(() -> {
            System.out.println("hello");
        }, 3, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
            futureScheduled.cancel(true);
        }catch (Exception e){

        }

    }
}
