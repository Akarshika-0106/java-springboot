package machine.coding.practice.java.Multithreading.Basics;

public class Main {
    public static void main(String[] args) {
        MonitorLock object = new MonitorLock();
        MonitorThreadRunnable runnableObj = new MonitorThreadRunnable(object);
        Thread thread1 = new Thread(runnableObj);
        // Thread thread1 = new Thread(() -> {object.task1();});
        Thread thread2 = new Thread(() -> {object.task2();});
        Thread thread3 = new Thread(() -> {object.task3();});
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
