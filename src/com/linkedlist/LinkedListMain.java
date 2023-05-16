package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to addNode and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        // Printing linkedList before deleting element
        linkedList.printLinkedList();
        linkedList.deleteLast();
        // Printing linkedList after deleting element
        linkedList.printLinkedList();
    }
}
