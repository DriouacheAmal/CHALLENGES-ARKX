package week2.Day12;

import java.util.Comparator;
import java.util.List;

public class Concurrently {
    public static void executeTasksConcurrently(List<Task> tasks) {
        tasks.stream()
                .parallel()
                .sorted(Comparator.comparing(Task::getDuration)) // refrence method lambda
                .forEachOrdered(task -> {
                    System.out.println("Task " + task.getTaskName() + " started concurrently.");
                    task.execute();
                });
    }


}
