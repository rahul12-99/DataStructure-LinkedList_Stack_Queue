package com.linkedlist;

public class LinkedList {
    Node head;

    /**
     * This method is for addNode data followed by the next pointer
     */
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * This method is for print linkedList
     */
    public void printLinkedList(){
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
}
