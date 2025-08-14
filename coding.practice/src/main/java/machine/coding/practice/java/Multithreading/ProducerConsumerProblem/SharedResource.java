package machine.coding.practice.java.Multithreading.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedQueue;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{
        while(sharedQueue.size() == bufferSize){
            System.out.println("Queue is full, waiting for consumer to consume");
            wait();
        }
        sharedQueue.add(item);
        System.out.println("Produced: "+item);
        notify();
    }

    public synchronized int consume() throws Exception{
        while(sharedQueue.isEmpty()){
            System.out.println("Queue is empty, waiting for producer to produce");
            wait();
        }
        int item = sharedQueue.poll();
        System.out.println("Consumed: "+item);
        notify();
        return item;
    }
}
