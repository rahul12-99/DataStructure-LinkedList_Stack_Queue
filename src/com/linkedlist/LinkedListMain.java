package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to addNode and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(70);
        // Printing linkedList before inserting element
        linkedList.printLinkedList();
        linkedList.insertAt(30,1);
        // Printing linkedList after inserting element
        linkedList.printLinkedList();
    }
}
