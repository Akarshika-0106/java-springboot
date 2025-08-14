package machine.coding.practice.java.Multithreading.Basics;

public class MonitorThreadRunnable implements Runnable{
    MonitorLock monitorLock;

    public MonitorThreadRunnable(MonitorLock monitorLock){
        this.monitorLock = monitorLock;
    }

    public void run(){
        monitorLock.task1();
    }
}
