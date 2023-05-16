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
     * This method is for delete element on linkedList using keys
     */
    public void deleteAfterAnyNode(int key) {
        Node temp = head;
        Node previous = head;
        if (temp == null){
            System.out.println("List is empty: ");
            return;
        }
        if (temp.data == key){
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key){
            previous = temp;
            temp = temp.next;
        }
        assert temp != null;
        previous.next = temp.next;

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
