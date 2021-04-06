package DoublyLinkedlist;

public class DoublyLinkedlist_InsertElem {

    public static void main(String[] args) {
        Node head = new Node(30);
        Node temp1 = new Node(40);
        Node temp2 = new Node(50);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insertBegin(head, 20);
        head = insertBegin(head, 10);

        head = insertEnd(head, 60);
        head = insertEnd(head, 70);

        printList(head);

        head = reverseDLL(head);

        printList(head);

        head = deleteHead(head);

        printList(head);

        head = deleteLast(head);

        printList(head);
    }
    //deleting last node of a DLL
    private static Node deleteLast(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr  = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    //deleting head node of a doubly linked list
    private static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }
    // here the code will reverse the DLL

    private static Node reverseDLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = null;
        Node curr = head;

        while (curr != null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    //here element is inserting at end of the DLL
    private static Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    //here element is inserting at beginning of the DLL
    private static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    private static void printList(Node head) {
        Node curr = head;
        System.out.print("null <----> ");
        while (curr != null)
        {
            System.out.print(curr.data + " <----> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

}
