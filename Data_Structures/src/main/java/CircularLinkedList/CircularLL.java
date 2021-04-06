package CircularLinkedList;

public class CircularLL {
    public static void main(String[] args) {
        /*Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;*/
        Node head = null;
        head = insertBeg(head, 90);
        head = insertBeg(head, 80);
        head = insertBeg(head, 70);
        head = insertBeg(head, 60);
        head = insertEnd(head, 15);
        head = insertEnd(head, 25);
        head = insertEnd(head, 35);
        printList(head);
        head = delHead(head);
        System.out.println();
        printList(head);
        head = deleteKthNode(head, 5);
        System.out.println();
        printList(head);


    }


    //Naive Solution for inserting element at begin of CLL at O(n) cost
    /*private static Node insertBeg(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;
        if (head == null) {
            temp.next = temp;
        }
        else
        {
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }*/
    //Tricky and efficient way to insert element at begin of CLL at O(1) cost

    private static Node insertBeg(Node head, int x) {
        Node temp = new Node(x);
        if (head == null){
            temp.next = temp;
            return temp;
    }
        else
        {
            temp.next = head.next;
            head.next = temp;

            int i = head.data;
            head.data = temp.data;
            temp.data = i;

        }
        return head;
    }

    //Naive approach to insert element at end of a CLL O(n)
    /*private static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }*/
    //Tricky and Efficient Approach to insert element at end of a CLL O(1)
    private static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        else
        {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp; //head = head.next;
        }
    }


    //naive approach to delete Head of a CLL in O(n) times
    /*private static Node delHead(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        return (curr.next);
    }*/
    //tricky and efficient approach to delete head of a CLL in O(1) times

    private static Node delHead(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    //Delete Kth Node of a CLL
    private static Node deleteKthNode(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        Node curr = head;
        for (int i = 0; i < k-2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

    }

    //Traversing the CLL
    private static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data+"  ");
        for(Node r = head.next; r != head; r = r.next)
            System.out.print(r.data+"  ");

    }
}
