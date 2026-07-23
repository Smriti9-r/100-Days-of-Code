import java.util.*;
public class  Day27{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    static Node insertEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static String findIntersection(Node head1,Node head2){
        int len1 =0;
        int len2= 0;
        Node temp1 = head1;
        Node temp2 = head2;

        //length of first list
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }

        //length of second list
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }

        //move londer list ahead
        if(len1>len2){
            int diff = len1 - len2;
            while(diff>0){
                head1= head1.next;
                diff--;
            }
        }
        else{
            int diff=len2-len1;
            while(diff>0){
                head2 = head2.next;
                diff--;
            }
        }
        //traverse both lists simultaneously
        while(head1!=null && head2!=null){
            if(head1.data == head2.data){
                return String.valueOf(head1.data);
            }
            head1= head1.next;
            head2 = head2.next;
        }
        return "No Intersection";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head1 = null;
        for(int i =0;i<n;i++){
            head1 = insertEnd(head1,sc.nextInt());
        }

        int m = sc.nextInt();
        Node head2 = null;
        for(int i =0;i<n;i++){
            head2 = insertEnd(head2,sc.nextInt());
        }
        System.out.println(findIntersection(head1, head2));
        sc.close();

    }

}