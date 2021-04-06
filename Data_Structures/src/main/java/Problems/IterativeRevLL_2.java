package Problems;

import java.util.ArrayList;

public class IterativeRevLL_2 {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printList(head);
        head=reverse(head);
        printList(head);
    }

    //In this approach we can use three pointers to reverse the LL
    private static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;//Now prev is the new head of the LL
    }


    private static void printList(Node head) {
        Node curr = head;

        while(curr!=null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
