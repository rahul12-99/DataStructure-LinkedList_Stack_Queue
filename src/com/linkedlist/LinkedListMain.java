package com.linkedlist;

public class LinkedListMain {
    /**
     * Main method in main class to addNode,searchNode and printLinkedList
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        // Printing linkedList
        linkedList.printLinkedList();
        int ans =linkedList.search(30);
        if(ans == -1){
            System.out.println("Element not found in list");
        }else {
            System.out.println("Element found at : " + ans);
        }
    }
}
