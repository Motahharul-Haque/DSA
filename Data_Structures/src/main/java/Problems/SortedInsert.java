package Problems;

public class SortedInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = sortedInsert(head, 35);
        printList(head);
        System.out.println();
        head = sortedInsert(head, 25);
        printList(head);
        System.out.println();
        head = sortedInsert(head, 50);
        printList(head);
        System.out.println();
        head = sortedInsert(head, 5);
        printList(head);
        System.out.println();
    }

    private static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        if (x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x)
                curr = curr.next;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    private static void printList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ---> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}