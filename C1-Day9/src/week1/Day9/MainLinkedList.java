package week1.Day9;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedListOperations linkedList = new LinkedListOperations();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.print();

        linkedList.remove(20);

        linkedList.print();

        int lenght = linkedList.length();
        System.out.println("Length: " + lenght);

        linkedList.reverse();

        linkedList.print();

    }
}
