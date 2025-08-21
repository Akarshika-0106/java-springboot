package codingpractice.Multithreading.Basics;

public class MonitorLock {

    public synchronized void task1(){
        try {
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("task1 completed");
        }catch (Exception e){
            //exception handling here
            System.out.println(e);
        }
    }

    public void task2(){
        System.out.println("task2 before synchronized");
        synchronized (this){
            System.out.println("task2 inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}
