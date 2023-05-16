package com.linkedlist;

public class LinkedList {
    Node head;

    /**
     * This method is for insert element on linkedList in ascending order
     */

    public void insertInAscending(int data){
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && data > current.next.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
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
