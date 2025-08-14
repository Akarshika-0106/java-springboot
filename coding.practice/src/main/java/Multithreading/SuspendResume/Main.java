package Multithreading.SuspendResume;

public class Main {
    public static void main(String[] args) throws Exception{
        SharedResource sharedResource = new SharedResource();
        System.out.println("Starting main thread");

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" calling produce method");
            sharedResource.produce();
        });

        Thread thread2 = new Thread(() -> {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                //handle exception
            }
            System.out.println(Thread.currentThread().getName()+" calling produce method");
            sharedResource.produce();
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            //handle exception
        }

        System.out.println(thread1.getName()+" is suspended");
       // thread1.suspend();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            //handle exception
        }

        System.out.println(thread1.getName()+" is resumed");
      //  thread1.resume();
        System.out.println("Main thread is finishing its work");
    }
}
