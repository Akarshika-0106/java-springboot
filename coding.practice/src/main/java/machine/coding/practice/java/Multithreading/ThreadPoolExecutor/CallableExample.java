package machine.coding.practice.java.Multithreading.ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallableExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());

        Future<?> threadPoolExecutor1 = threadPoolExecutor.submit(() -> {
            System.out.println("Runnable is called");
        });

        try {
            Object object = threadPoolExecutor1.get();
            System.out.println(object == null);
        }catch (Exception e){

        }

        Future<Integer> threadPoolExecutor2 = threadPoolExecutor.submit(() -> {
            System.out.println("Callable is called");
            return 45;
        });

        try {
            Object object = threadPoolExecutor2.get();
            System.out.println(object);
        }catch (Exception e){

        }


        Future<List<Integer>> futureObj = threadPoolExecutor.submit(()->{
            List<Integer> output = new ArrayList<>();
            output.add(200);
            return output;
        });

        try {
            List<Integer> result = futureObj.get();
            System.out.println(result.get(0));
        }catch (Exception e){

        }

    }
}
