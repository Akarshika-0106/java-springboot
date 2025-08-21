package codingpractice.Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    // ThreadPoolExecutor helps to create a customizable ThreadPool
    // If all the threads of core pool is busy, and queue is full,
    // then we will create new threads till it reaches maximum pool size.
    // If the maximum pool size is reached and queue is still full, then the coming task will be rejected.

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                        Executors.defaultThreadFactory(), new CustomRejectHandler());
        threadPoolExecutor.allowCoreThreadTimeOut(true);


        for(int i=1; i<=7; i++) {
            threadPoolExecutor.submit(() -> {
                try{
                    Thread.sleep(5000);
                }catch (Exception e){
                    //handle exception here
                }
                System.out.println("Task processed by: "+Thread.currentThread().getName());
            });
        }

        threadPoolExecutor.shutdown();

        //The below initialization has custom thread factory
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
//                (2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
//                        new CustomThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
