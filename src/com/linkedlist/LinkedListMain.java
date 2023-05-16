package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to deleteAnyElement and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        // Printing linkedList before delete the element
        linkedList.printLinkedList();
        linkedList.deleteAfterAnyNode(56);
        // Printing LinkedList after delete the element
        linkedList.printLinkedList();
    }
}
