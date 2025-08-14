package machine.coding.practice.java.Multithreading.SuspendResume;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce(){
        System.out.println("Lock acquired by "+Thread.currentThread().getName());
        isAvailable = true;

        try{
            Thread.sleep(8000);
        }catch(Exception e){
            //handle exception
        }

        System.out.println("Lock released by "+Thread.currentThread().getName());
    }
}
