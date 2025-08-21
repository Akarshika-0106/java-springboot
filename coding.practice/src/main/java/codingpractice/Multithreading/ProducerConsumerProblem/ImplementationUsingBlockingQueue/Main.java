package codingpractice.Multithreading.ProducerConsumerProblem.ImplementationUsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        ProducerBlockingQueue producerBlockingQueue = new ProducerBlockingQueue(queue);
        ConsumerBlockingQueue consumerBlockingQueue = new ConsumerBlockingQueue(queue);

        Thread producerThread = new Thread(producerBlockingQueue);
        Thread consumerThread = new Thread(consumerBlockingQueue);
        producerThread.start();
        consumerThread.start();
    }
}
