// Problem: Delete First Occurrence of a Key - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers
// - Third line: integer key

// Output:
// - Print the linked list elements after deletion, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50
// 30

// Output:
// 10 20 40 50

// Explanation:
// Traverse list, find first node with key, remove it by adjusting previous node's next pointer.

import java.util.*;

public class Day24 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Delete first occurrence of key
    static Node deleteFirstOccurrence(Node head, int key) {

        
        if (head == null) {
            return null;
        }

        // If key is in the first node
        if (head.data == key) {
            return head.next;
        }

        Node current = head;

      
        while (current.next != null) {

            if (current.next.data == key) {
                // Delete the node
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }

        return head;
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

       
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertEnd(head, data);
        }

       
        int key = sc.nextInt();

      
        head = deleteFirstOccurrence(head, key);

        printList(head);

        sc.close();
    }
}