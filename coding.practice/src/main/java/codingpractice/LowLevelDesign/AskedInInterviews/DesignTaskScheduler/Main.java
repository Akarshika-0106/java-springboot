package codingpractice.LowLevelDesign.AskedInInterviews.DesignTaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        taskScheduler.addTask("1", 5, () -> System.out.println("Task1 executed") );
        taskScheduler.addTask("2", 2, () -> System.out.println("Task2 executed") );

        try{
            Thread.sleep(1000);
            taskScheduler.cancelTask("1");
            Thread.sleep(6000);
            taskScheduler.shutDown();
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

    }
}
