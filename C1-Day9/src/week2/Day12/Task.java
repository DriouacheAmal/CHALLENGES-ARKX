package week2.Day12;

import java.util.concurrent.TimeUnit;

public class Task {
    private int taskId;
    private String taskName;
    private long duration;
    // private statuts

    public Task(int taskId,String taskName,long duration){
        this.taskId = taskId;
        this.taskName = taskName;
        this.duration = duration;
        //this.statuts


    }

    public int getTaskId() {
        return taskId;
    }
    public String getTaskName(){
        return taskName;
    }
    public long getDuration(){
        return duration;
    }
    @Override
    public String toString() {
        return taskId + " " + taskName + " " + duration;
    }
    // execute() method; that simulates the execution of the task by sleeping for the specified duration
    // and printing a completion message.
    public void execute() {
        try {
            TimeUnit.MILLISECONDS.sleep(duration);
            System.out.printf("Executing Task %s... Completed! (Duration: %d ms)\n", taskName, duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
