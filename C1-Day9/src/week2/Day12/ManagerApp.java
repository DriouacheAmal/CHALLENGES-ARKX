package week2.Day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static week2.Day12.Asynchronous.executeTasksAsynchronously;
import static week2.Day12.Concurrently.executeTasksConcurrently;
import static week2.Day12.Synchronous.executeTasksSynchronously;


public class ManagerApp {
    public static void main(String[] args) {
        // Synchronous Task Execution
        System.out.println("Synchronous Task Execution:");
        executeTasksSynchronously(createTasks());

        // Asynchronous Task Execution
        System.out.println("\nAsynchronous Task Execution:");
        executeTasksAsynchronously(createTasks());

        // Concurrent Task Execution
        System.out.println("\nConcurrent Task Execution:");
        executeTasksConcurrently(createTasks());

        // Prioritized Task Execution
       // System.out.println("\nPrioritized Task Execution:");
       // executeTasksWithPriority(createTasks());
    }

    // createTasks() method creates a list of Task objects with different task IDs, names,
// and durations.
    public static List<Task> createTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "A", 2000));
        tasks.add(new Task(2, "B", 1500));
        tasks.add(new Task(3, "C", 3000));
        return tasks;
    }
    //The executeTasksSynchronously() method demonstrates synchronous task execution.
// It iterates over the list of tasks and executes each task one by one,
// waiting for each task to complete before moving on to the next.
    // class
    /*public static void executeTasksSynchronously(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Executing Task " + task.getTaskName() + "...");
            task.execute();
            try {
                Thread.sleep(task.getDuration());
            } catch (InterruptedException e) {

            }
        }

    }*/
    //class
    /*public static void executeTasksAsynchronously(List<Task> tasks) {
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
    }*/

    /*public static void executeTasksConcurrently(List<Task> tasks) {
        tasks.stream()
                .parallel()
                .sorted(Comparator.comparing(Task::getDuration)) // refrence method lambda
                .forEachOrdered(task -> {
                    System.out.println("Task " + task.getTaskName() + " started concurrently.");
                    task.execute();
                });
    }*/


}
