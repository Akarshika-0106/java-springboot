package codingpractice.Multithreading.LockBasedMechanism.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {

        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource resource1 = new SharedResource();
        Thread thread1 = new Thread(() -> {
            resource1.readValue(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread thread2 = new Thread(() -> {
            resource2.readValue(lock);
        });

        SharedResource resource3 = new SharedResource();
        Thread thread3 = new Thread(() -> {
            resource3.writeValue(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
