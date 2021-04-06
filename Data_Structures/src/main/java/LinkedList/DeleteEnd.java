package LinkedList;

public class DeleteEnd {
    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeg(head, 10);
        head = insertAtBeg(head, 20);
        head = insertAtBeg(head, 30);

        printLL(head);
        head = deleteEnd(head);
        printLL(head);
    }

    private static Node deleteEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;

        while (curr.next.next != null)
            curr = curr.next;
        System.out.println("Element Deleted : "+curr.next.data);
        curr.next = null;
        return head;

    }


    private static void printLL(Node head) {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node insertAtBeg(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        temp.next = head;
        return temp;
    }
}
