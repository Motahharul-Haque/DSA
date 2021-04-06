package LinkedList;

public class SearchElemLL {
    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeg(head, 10);
        head = insertAtBeg(head, 20);
        head = insertAtBeg(head, 30);

        printLL(head);
        int pos = search(head, 10);
        System.out.println("Element Found at Position : " + pos);
        int pos1 = searchRecursive(head, 10);
        System.out.println("Element Found at Position : " + pos1);
    }

    private static int searchRecursive(Node head, int x) {
        if (head == null) {
            return -1;
        }
        if (head.data == x) {
            return 1;
        }
        else
        {
            int res = searchRecursive(head.next, x);
            if (res == -1) {
                return -1;
            }
            else
                return res + 1;
        }
    }

    private static int search(Node head, int x) {
        Node curr = head;
        int pos = 1;
        while (curr != null)
        {
            if (curr.data == x) {
                return pos;
            }
            else
            {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
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
