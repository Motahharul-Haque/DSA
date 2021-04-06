package LinkedList;

public class InsertBeg {

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBeg(head, 30);
        head = insertAtBeg(head, 20);
        head = insertAtBeg(head, 10);

        printList(head);
    }

    private static void printList(Node head) {

        Node curr = head;

        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    private static Node insertAtBeg(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }
}
