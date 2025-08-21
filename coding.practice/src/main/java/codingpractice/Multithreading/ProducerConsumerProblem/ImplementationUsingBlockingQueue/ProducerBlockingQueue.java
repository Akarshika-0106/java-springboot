package codingpractice.Multithreading.ProducerConsumerProblem.ImplementationUsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public ProducerBlockingQueue(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            for(int i=0; i<100; i++){
                Thread.sleep(1000);
                blockingQueue.add(i);
                System.out.println("Produced item: "+i);
            }

        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

    }
}
