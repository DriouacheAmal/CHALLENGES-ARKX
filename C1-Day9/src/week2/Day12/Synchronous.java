package week2.Day12;

import java.util.List;

public class Synchronous {
    public static void executeTasksSynchronously(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Executing Task " + task.getTaskName() + "...");
            task.execute();
            try {
                Thread.sleep(task.getDuration());
            } catch (InterruptedException e) {

            }
        }
    }
}
