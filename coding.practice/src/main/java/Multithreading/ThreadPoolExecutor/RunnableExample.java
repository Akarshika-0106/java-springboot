package Multithreading.ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RunnableExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());

        List<Integer> output = new ArrayList<>();

        Future<List<Integer>> futureObj = threadPoolExecutor.submit(new MyRunnable(output), output);
        try {
            List<Integer> result = futureObj.get();
            System.out.println(result.get(0));
        }catch (Exception e){

        }
    }
}
