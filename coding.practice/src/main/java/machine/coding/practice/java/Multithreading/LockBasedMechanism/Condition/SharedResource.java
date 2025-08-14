package machine.coding.practice.java.Multithreading.LockBasedMechanism.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce(){
        lock.lock();
        System.out.println("Produce lock acquired by: "+Thread.currentThread().getName());
        try{
            if(isAvailable){
                System.out.println("Produce thread is waiting");
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Produce lock released by: "+Thread.currentThread().getName());
        }
    }

    public void consume(){
        try{
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume lock aquired by: "+Thread.currentThread().getName());
            if (!isAvailable) {
                condition.await();
                System.out.println("Consume thread is waiting");
            }
            isAvailable = false;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Consume lock released by: "+Thread.currentThread().getName());
        }

    }
}
