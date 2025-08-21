package codingpractice.Multithreading.LockBasedMechanism.StampedLock.OptimisticLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void produce(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic read");
            a = 11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Successfully updated");
            }else{
                System.out.println("Rollback");
                a = 10;
            }

        }catch (Exception e){

        }
    }

    public void consume(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
        try{
            System.out.println("Performing work");
            a = 9;
            System.out.println("Value of a:"+a);
        }finally {
            lock.unlock(stamp);
            System.out.println("Write lock released by: "+Thread.currentThread().getName());
        }
    }
}
