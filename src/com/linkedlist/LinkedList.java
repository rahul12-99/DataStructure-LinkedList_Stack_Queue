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
     * This method is for search element on linkedList
     */

    public int search(int element){
        int index = 0;
        Node current = head;
        if(head == null){
            System.out.println("List is empty: ");
            return -1;
        }
        while (current != null){
            if (current.data == element){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
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
