package codingpractice.Multithreading.LockBasedMechanism.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void readValue(ReadWriteLock lock){
        try{
            lock.readLock().lock(); //Shared lock (S)
            System.out.println("[" + System.currentTimeMillis() + "] Read lock acquired by "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        }catch(Exception e){
            //handle exception
        }finally {
            lock.readLock().unlock();
            System.out.println("[" + System.currentTimeMillis() + "] Read lock released by "+Thread.currentThread().getName());
        }
    }

    public void writeValue(ReadWriteLock lock){
        try{
            lock.writeLock().lock(); //Exclusive lock (X)
            System.out.println("[" + System.currentTimeMillis() + "] Write lock acquired by "+Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(4000);
        }catch (Exception e){
            //handle exception
        }finally {
            lock.writeLock().unlock();
            System.out.println("[" + System.currentTimeMillis() + "] Write lock released by "+Thread.currentThread().getName());
        }
    }
}
