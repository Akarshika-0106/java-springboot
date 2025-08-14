package machine.coding.practice.java.Multithreading;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set(Thread.currentThread().getName());

        Thread thread1 = new Thread(() ->{
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("Task1");
        });

        thread1.start();

        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }

        System.out.println("Main thread: "+threadLocal.get());
    }
}
