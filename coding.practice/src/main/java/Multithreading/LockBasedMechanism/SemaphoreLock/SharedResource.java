package Multithreading.LockBasedMechanism.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void produce(){
        try{
            lock.acquire();
            System.out.println(System.currentTimeMillis()+" Lock acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception e){

        }finally {
            lock.release();
            System.out.println(System.currentTimeMillis()+" Lock released by: "+Thread.currentThread().getName());
        }
    }
}
