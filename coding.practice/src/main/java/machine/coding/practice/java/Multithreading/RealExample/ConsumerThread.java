package machine.coding.practice.java.Multithreading.RealExample;

public class ConsumerThread implements Runnable{

    private SharedResource sharedResource;

    public ConsumerThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run(){
        System.out.println("Consumer thread is "+Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
