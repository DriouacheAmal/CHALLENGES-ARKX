package week2.Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Asynchronous {
    public static void executeTasksAsynchronously(List<Task> tasks) {
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        for (Task task : tasks) { // try catch sleep might show an exception
            CompletableFuture<Void> future = CompletableFuture.runAsync(task::execute);
            futures.add(future);
            System.out.println("Task " + task.getTaskName() + " started asynchronously.");
        }
//
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> System.out.println("All tasks completed asynchronously!"))
                .join();
        // The join() method is used in the provided code to wait for all the CompletableFuture
        // objects to complete before proceeding with the next steps.
    }

}
