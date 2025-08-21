package codingpractice.Multithreading.LockBasedMechanism.StampedLock.ReadWriteLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void produce(){
        long stamp = lock.readLock(); //Here stamp is state(version) of the lock
        System.out.println(System.currentTimeMillis()+" Lock acquired by: "+Thread.currentThread().getName());
        try {
            isAvailable = true;
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //handle exception
        }finally {
            lock.unlock(stamp);
            System.out.println(System.currentTimeMillis()+" Lock released by: "+Thread.currentThread().getName());
        }
    }

    public void consume(){
        long stamp = lock.writeLock();
        System.out.println(System.currentTimeMillis()+" Lock acquired by: "+Thread.currentThread().getName());
        try {
            isAvailable = false;
            //Thread.sleep(6000);
        }catch (Exception e){
            //handle exception
        }finally {
            lock.unlock(stamp);
            System.out.println(System.currentTimeMillis()+" Lock released by: "+Thread.currentThread().getName());
        }

    }
}
