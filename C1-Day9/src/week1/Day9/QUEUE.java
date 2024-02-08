package week1.Day9;

import java.util.ArrayList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class QUEUE {
    private ArrayList<Integer> queue;

    public void Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int value) {
        queue.add(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        return queue.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek element.");
            return -1;
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
