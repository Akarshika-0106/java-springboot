package machine.coding.practice.java.Multithreading.LockBasedMechanism.StampedLock.OptimisticLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(() -> {
            resource.produce();
        });

        Thread thread2 = new Thread(() -> {
            resource.consume();
        });

        thread1.start();
        thread2.start(); //If we comment thread2.start() here, then variable a will be updated successfully/

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resource.a);
    }
}
