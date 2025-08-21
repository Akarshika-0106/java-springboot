package codingpractice.Multithreading.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = forkJoinPool.submit(new ComputeSumTask(0, 100));
        // When we submit, this task goes to the submission queue
        // When we do fork(), the subtask will go to the work stealing queue
        // If the submission queue is empty and also if a thread does not have any task in its
        // work stealing queue, then it can steal the task from the other thread's work stealing queue.

        try {
            System.out.println(futureObj.get());
        }catch (Exception e){

        }
    }
}
