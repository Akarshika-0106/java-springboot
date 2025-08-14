package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread();
        thread.setDaemon(false);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setName("ProduceThread");
        return thread;
    }
}
