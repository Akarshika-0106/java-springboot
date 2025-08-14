package Multithreading.RealExample;


public class SharedResource {

    private boolean isAvailable;

    public synchronized void addItem(){
        System.out.println("Item is added by Producer Thread "+Thread.currentThread().getName());
        isAvailable = true;
        System.out.println("Producer Thread "+Thread.currentThread().getName()+ " is calling notifyAll");
        notifyAll(); //notify all threads in the waiting state to go to runnable state
    }

    public synchronized void consumeItem(){
        while(!isAvailable){
            try {
                System.out.println("Consumer Thread "+ Thread.currentThread().getName()+" is waiting");
                wait(); //release all the monitor locks

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Item is consumed by Consumer Thread "+Thread.currentThread().getName());
        isAvailable = false;
    }
}
