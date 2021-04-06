package Problems;

import java.util.ArrayList;

public class IterativeRevLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printList(head);
        head=revList(head);
        printList(head);
    }

    //In this approach a new Arraylist will be created to store all the elements of LL
    //then we reverse the LL by using the arraylist
    private static Node revList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next)
        {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next)
        {
            curr.data = arr.remove(arr.size() - 1);
        }
        return head;
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
