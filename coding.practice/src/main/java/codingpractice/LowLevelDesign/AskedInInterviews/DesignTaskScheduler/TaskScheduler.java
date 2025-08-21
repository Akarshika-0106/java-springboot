package codingpractice.LowLevelDesign.AskedInInterviews.DesignTaskScheduler;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskScheduler {
    private final PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
    private final Set<String> cancelled = ConcurrentHashMap.newKeySet();
    private final Thread worker;
    private volatile boolean running = true;

    public TaskScheduler() {
        worker = new Thread(new Worker());
        worker.setDaemon(true);
        worker.start();
    }

    public void addTask(String taskId, int delayInSeconds, Runnable action){
        queue.offer(new Task(taskId, delayInSeconds, action));
        System.out.println("Task added with task id: "+taskId+" with delay of "+delayInSeconds+" seconds");
    }

    public void cancelTask(String taskId){
        cancelled.add(taskId);
        System.out.println("Task id: "+taskId+" cancelled");
    }

    public boolean isRunning() {
        return running;
    }

    public void shutDown(){
        running = false;
        worker.interrupt();
    }

    private class Worker implements Runnable{

        @Override
        public void run() {
            try{
                while(isRunning()){
                    Task task = queue.take();
                    long waitingTime = task.getExecutionTime() - System.currentTimeMillis()/1000;
                    if(waitingTime > 0){
                        queue.offer(task);
                        Thread.sleep(waitingTime*1000L);
                        continue;
                    }

                    if (!cancelled.contains(task.getId())) {
                        task.getAction().run();
                    }
                }

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
