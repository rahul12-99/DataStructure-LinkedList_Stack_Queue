package com.linkedlist;

public class LinkedList {
    Node head;

    /**
     * This method is for appending the LinkedList
     */
    public void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    /**
     * This method is for delete first element form linkedList (Pop Method)
     */
    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
        }else {
            Node temp = head;
            head = temp.next;
        }
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
