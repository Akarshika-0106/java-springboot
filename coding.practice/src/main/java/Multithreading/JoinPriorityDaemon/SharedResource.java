package Multithreading.JoinPriorityDaemon;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce(){
        isAvailable = true;
        System.out.println("Lock acquired by "+Thread.currentThread().getName());
        try {
            Thread.sleep(8000);
        }catch (Exception e){
            //handle exception
        }
        System.out.println("Lock released by "+Thread.currentThread().getName());
    }
}
