package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to addNode and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(56);
        linkedList.addFirst(30);
        linkedList.addFirst(70);
        linkedList.printLinkedList();
    }
}
