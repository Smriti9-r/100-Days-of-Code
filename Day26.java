// Problem: Doubly Linked List Insertion and Traversal - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers

// Output:
// - Print the linked list elements in forward order, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50

// Output:
// 10 20 30 40 50

// Explanation:
// Each node has data, next, prev. Insert nodes sequentially, traverse from head using next pointer.

import java.util.*;
public class Day26{
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static Node insertEnd(Node head ,int data){
        Node newNode = new Node( data);
        if(head ==null){
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    //printing
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i =0;i<n;i++){
            int data = sc.nextInt();
            head = insertEnd(head,data);
        }
        printList(head);
    }
    

}