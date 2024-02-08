package week1.Day9;

public class MainStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        System.out.println("Top element :" + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();

        System.out.println("Is stack empty?" + stack.isEmpty());

    }



}
