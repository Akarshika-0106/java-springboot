package codingpractice.LowLevelDesign.AskedInInterviews.DesignTaskScheduler;

public class Task implements Comparable<Task>{
    private String id;
    private long executionTime;
    private Runnable action;

    public Task(String id, long delayInSeconds, Runnable action) {
        this.id = id;
        this.executionTime = System.currentTimeMillis()/1000 + delayInSeconds;
        this.action = action;
    }

    @Override
    public int compareTo(Task that) {
        return Long.compare(this.executionTime, that.executionTime);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public Runnable getAction() {
        return action;
    }

    public void setAction(Runnable action) {
        this.action = action;
    }
}
