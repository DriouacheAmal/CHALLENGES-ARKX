package week1.Day9;

import java.util.LinkedList;

public class LinkedListOperations {
    private Node head;

    private static class Node {
        int data;
        Node next;
//"node" refers to an individual element or unit of data within the linked list
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
// Add a node to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
//Remove a node from the linked list
    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }
// Find and print the length of the linked list
    public int length() {
        int length = 0;
        Node currentNode = head;
        while (currentNode != null) {
            length++; //length++ would increment the length variable by 1 whenever a new node is added to the linked list
            currentNode = currentNode.next;
        }
        return length;
    }
// Reverse the linked list
    public void reverse() {
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;
    }
// print
    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
