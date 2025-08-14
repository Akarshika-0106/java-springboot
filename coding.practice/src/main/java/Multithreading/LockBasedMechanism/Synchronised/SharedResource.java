package Multithreading.LockBasedMechanism.Synchronised;

public class SharedResource {
    boolean isAvailable = false;


    public synchronized void produce(){
        try{
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            //handle exception here
        }
        System.out.println("Lock released by "+Thread.currentThread().getName());
    }
}
