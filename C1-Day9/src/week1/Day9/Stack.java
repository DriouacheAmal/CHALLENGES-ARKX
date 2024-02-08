package week1.Day9;

public class Stack {
// the week1.Day9.Stack class is a part of the Java Collections Framework and
    //provides a way to implement a Last-In-First-Out (LIFO) data structure.
// The usual push and pop operations are supported, allowing you to add elements
// to the top of the stack and remove elements from the top.
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size){
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];

    }
    public void push (int value) {
        if (top == maxSize - 1) {
            System.out.println("week1.Day9.Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }
    //Peek (get the element at the top of the stack without removing it)
    public int peek() {
        if (top == -1) {
            System.out.println("week1.Day9.Stack is empty. Cannot peek element.");
            return -1;
        }
        return stackArray[top];
    }
    // Pop (remove the element from the top of the stack)
    public int pop() {
        if (top == -1) {
            System.out.println("week1.Day9.Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArray[top--];

    }
    // Check if the stack is empty.
    public boolean isEmpty() {
        return top == -1;

    }

}
