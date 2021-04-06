package Problems;

public class PrintMiddleElem {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
        System.out.print("Position of middle element in Linked List is : ");
        printMiddle(head);
        System.out.println();
        System.out.print("Position of middle element in Linked List is by efficient approach: ");
        printMiddleEfficient(head);
    }

    //Efficient Solution to print middle element of a linked list
    private static void printMiddleEfficient(Node head) {
        if (head == null) {
            return;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }

    //Naive Solution to print middle element of a linked list
    private static void printMiddle(Node head) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr;

        for(curr = head; curr != null; curr = curr.next)
            count++;

        curr = head;

        for (int i = 0; i < count/2; i++) {
            curr = curr.next;
        }
        System.out.print(curr.data);
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
