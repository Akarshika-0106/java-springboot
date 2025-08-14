package Multithreading.RealExample;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread consumerThread = new Thread(new ProducerThread(sharedResource));
        Thread producerThread = new Thread(new ConsumerThread(sharedResource));
        producerThread.start();
        consumerThread.start();
    }
}
