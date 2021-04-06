package Problems;

public class NthNodeFromLast {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        printList(head);
        System.out.print("Nth node from end of Linked List: ");
        printNthFromEnd(head,2);
    }


    //Method 1 : using length of linked list
//    private static void printNthFromEnd(Node head, int x) {
//        int len = 0;
//
//        for(Node curr  = head; curr != null; curr = curr.next)
//            len++;
//
//        if (len < x)
//            return;
//
//        Node curr = head;
//
//        for (int i = 0; i < len - x + 1; i++) {
//            curr = curr.next;
//
//        }
//        System.out.print(curr.data);
//
//
//    }

    // Method 2 : using two pointers / reference
    private static void printNthFromEnd(Node head, int x) {
        if (head == null) {
            return;
        }

        Node first = head;
        for (int i = 0; i < x; i++) {
            if (first == null) {
                return;
            }
            first = first.next;
        }

        Node second = head;
        while (first != null)
        {
            second = second.next;
            first = first.next;
        }
        System.out.print(second.data);
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
