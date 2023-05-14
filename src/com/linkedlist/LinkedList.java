package com.linkedlist;

public class LinkedList {
    Node head;

    /**
     * This method is for addNode data followed by the next pointer
     */
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
}
