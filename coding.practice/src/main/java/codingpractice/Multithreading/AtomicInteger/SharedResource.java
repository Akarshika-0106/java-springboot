package codingpractice.Multithreading.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);
    // You can use AtomicBoolean, AtomicLong, AtomicReference ( for any other object)
    // This is used in the scenarios where there is read, modify and update.
    // Volatile variable does not guarantee concurrency property and is not thread safe but it make sure that any
    // changes done by one thread is visible to the other threads.


    //int counter1 = 0;

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return counter.get();
    }

//    public void increment1(){
//        counter1++;
//    }
//
//    public int getCounter1(){
//        return counter1;
//    }
}
