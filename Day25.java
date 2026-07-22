// Problem: Count Occurrences of an Element in Linked List - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n (number of nodes)
// - Second line: n space-separated integers (linked list elements)
// - Third line: integer key (element to be counted)

// Output:
// - Print the number of times the key appears in the linked list

// Example:
// Input:
// 6
// 10 20 30 20 40 20
// 20

// Output:
// 3

// Explanation:
// Traverse the linked list from head to end. Each time a node's data matches the given key, increment a counter. After traversal, print the final count.
import java.util.*;
public class Day25{
    static class Node{
        int data;
        Node next;

        Node(int data){
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

    //count the occurence of elements
    static int countElement(Node head, int key) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null; 
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertEnd(head, data);
        } 
        int key = sc.nextInt();
        int count = countElement(head,key) ;
        System.out.println("Count"+" "+count);

    }
}