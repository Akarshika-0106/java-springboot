package machine.coding.practice.java.Multithreading.JoinPriorityDaemon;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main thread started");
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+ " calling the produce method");
            sharedResource.produce();
        });

        // 1 means low priority
        // 10 means high priority
        // We can not rely on thread priority because it does not guarantee to follow any specific order
        // thread1.setPriority(Thread.MAX_PRIORITY);

        //If we want to make a daemon thread, we need to set Daemon as true.
        // Otherwise, it will be called user thread.
        // Daemon thread is alive till one of the user threads is alive.
        // Here, main is the user thread and thread1 is the daemon thread.
        // uses of daemon thread: logging, garbage collector and auto-save in editor, it periodically saves.
        //thread1.setDaemon(true);

        thread1.start();



        try{
            System.out.println("Main thread is waiting for "+thread1.getName()+" to finish");
            thread1.join();
            //If we want to complete the execution of one thread before other thread, we use join thread.
        }catch (Exception e){

        }

        System.out.println("Main thread is finishing its work");
    }
}
