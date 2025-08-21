package codingpractice.Multithreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = threadPoolExecutor.submit(()->{
            try{
                Thread.sleep(7000);
                System.out.println("This task will be executed by the thread");
            }catch (Exception e){
                //handle exception
            }
        });

        System.out.println("Is done?: "+futureObj.isDone());
        try{
            futureObj.get(2, TimeUnit.SECONDS);
        }catch (TimeoutException e){
            System.out.println("Timeout exception");
        }catch (Exception e){

        }

        try{
            futureObj.get();
        }catch (Exception e){

        }

        System.out.println("Is cancelled? "+futureObj.isCancelled());
        System.out.println("Is done?: "+futureObj.isDone());
    }
}
