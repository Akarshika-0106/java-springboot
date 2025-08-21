package codingpractice.Multithreading.ProducerConsumerProblem.ImplementationUsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable{
    private BlockingQueue<Integer> blockingQueue;

    public ConsumerBlockingQueue(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try{
            while(true){
                int item = blockingQueue.take();
                System.out.println(" Consumed item: "+item);
                Thread.sleep(2000);
            }

        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

    }
}
