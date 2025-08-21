package codingpractice.Multithreading.LockBasedMechanism.Synchronised;

public class Main {

    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        Thread thread1 = new Thread(() -> {
            resource1.produce();
        });

        SharedResource resource2 = new SharedResource();
        Thread thread2 = new Thread(() -> {
            resource2.produce();
        });

        thread1.start();
        thread2.start();
    }
}
