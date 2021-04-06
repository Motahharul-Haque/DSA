package LinkedList;

public class TraverseLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        printLList(head);
        //recursive print
        /*recPrint(head);
        System.out.print("null");*/
    }

    private static void printLList(Node head) {

        Node curr = head;

        while (curr != null)
        {
            System.out.print(curr.data+" ---> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    //Recursive
    private static void recPrint(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ---> ");
        recPrint(head.next);
    }

}
