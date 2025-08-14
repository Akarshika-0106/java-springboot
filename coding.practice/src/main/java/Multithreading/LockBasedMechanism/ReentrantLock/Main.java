package Multithreading.LockBasedMechanism.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        SharedResource resource1 = new SharedResource();
        Thread thread1 = new Thread(() ->{
            resource1.producer(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread thread2 = new Thread(() ->{
            resource2.producer(lock);
        });

        thread1.start();
        thread2.start();
    }

//    Output:
//    [1749540409936] Lock acquired by Thread-0
//    [1749540413947] Lock acquired by Thread-1
//    [1749540413947] Lock released by Thread-0
//    [1749540417951] Lock released by Thread-1

//    Thread-1 does not acquire the lock until exactly when Thread-0 releases it.
//    Both "acquired" and "released" logs happen at the same millisecond,
//    which is why it looks suspicious, but it’s just timing coincidence, not a bug.
}
