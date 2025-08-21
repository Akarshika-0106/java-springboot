package codingpractice.Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());
        try {
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "Task completed";
            }, threadPoolExecutor);

            System.out.println(asyncTask1.get());
        }catch (Exception e){

        }

        try {
            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }
                return "Concept and ";
            }, threadPoolExecutor).thenApply((String val) -> {
                System.out.println("Thread name of thenApply: "+Thread.currentThread().getName());
                return val + "coding";
            }); //here, thenApply will use the same thread which has processed supplyAsync task
            System.out.println(asyncTask2.get());
        }catch (Exception e){

        }


        try {
            CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }
                return "Concept and ";
            }, threadPoolExecutor).thenApplyAsync((String val) -> {
                System.out.println("Thread name of thenApplyAsync: "+Thread.currentThread().getName());
                return val + "coding";
            }, threadPoolExecutor); //here, thenApplyAsync will use the different thread from the one which has processed supplyAsync task
            System.out.println(asyncTask3.get());
        }catch (Exception e){

        }

        // ordering is maintained in thenCompose and thenComposeAsync
        try {
            CompletableFuture<String> asyncTask4 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }
                return "Hello ";
            }, threadPoolExecutor)
                    .thenCompose((String val) -> {
                        System.out.println("Thread name of thenCompose: "+Thread.currentThread().getName());
                        return CompletableFuture.supplyAsync(() -> val+"world");
                    });
            System.out.println(asyncTask4.get());
        }catch (Exception e){

        }

        try {
            CompletableFuture<String> asyncTask5 = CompletableFuture.supplyAsync(() -> {
                        System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e){

                        }
                        return "Hello ";
                    }, threadPoolExecutor)
                    .thenComposeAsync((String val) -> {
                        System.out.println("Thread name of thenComposeAsync: "+Thread.currentThread().getName());
                        return CompletableFuture.supplyAsync(() -> val+"world");
                    }, threadPoolExecutor);
            System.out.println(asyncTask5.get());
        }catch (Exception e){

        }

        // End stage in the chain of async operation
        try {
            CompletableFuture<Void> asyncTask6 = CompletableFuture.supplyAsync(() -> {
                        System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e){

                        }
                        return "Hello ";
                    }, threadPoolExecutor)
                    .thenAccept((String val) -> {
                       System.out.println("Thread name of thenAccept: "+ Thread.currentThread().getName());
                       System.out.println(val+"world");
            });
        }catch (Exception e){

        }

        try {
            CompletableFuture<Void> asyncTask7 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name of supplyAsync: "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }
                return "Hello ";
            }, threadPoolExecutor).thenAcceptAsync((String val) -> {
                System.out.println("Thread name of thenAcceptAsync: "+ Thread.currentThread().getName());
                System.out.println(val+"world");
            }, threadPoolExecutor);
        }catch (Exception e){

        }


        //Used to combine the results of two completable future

        CompletableFuture<Integer> asyncTask8 = CompletableFuture.supplyAsync(() -> {
            return 10;
        }, threadPoolExecutor);

        CompletableFuture<String> asyncTask9 = CompletableFuture.supplyAsync(() -> {
            return "k ";
        }, threadPoolExecutor);


        CompletableFuture<String> combineFutureObj = asyncTask8.thenCombine(asyncTask9, (Integer val1, String val2) -> String.valueOf(val1) + val2);
        try{
            System.out.println(combineFutureObj.get());
        }catch (Exception e){

        }




    }

}
