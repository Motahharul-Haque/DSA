package LinkedList;

public class DeleteBeg {
    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeg(head, 10);
        head = insertAtBeg(head, 20);
        head = insertAtBeg(head, 30);

        printLL(head);
        head = deleteBeg(head);

        printLL(head);
    }

    private static Node deleteBeg(Node head) {
        if (head == null) {
            return null;
        }
        else {

            System.out.println("Element Deleted : "+head.data);;
            return head.next;
        }
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
