package com.linkedlist;

public class LinkedList {
    Node head;

    /**
     * This method is for appending the LinkedList
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    /**
     * This method is for search element on linkedList
     */
    public void insertAfterAnyNode(int data, int pos) {
        Node insertNode = new Node(data);
        // if list is empty
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node previousNode = head;
        for (int i = 0; i < pos - 1; i++) {
            previousNode = previousNode.next;
        }
        insertNode.next = previousNode.next;
        previousNode.next = insertNode;

    }


    /**
     * This method is for print linkedList
     */
    public void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
}
