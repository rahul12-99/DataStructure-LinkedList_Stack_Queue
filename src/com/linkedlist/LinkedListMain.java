package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to searchNode and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        // Printing linkedList before insert the element
        linkedList.printLinkedList();
        linkedList.insertAfterAnyNode(40,2);
        // Printing LinkedList after insert the element
        linkedList.printLinkedList();
    }
}
