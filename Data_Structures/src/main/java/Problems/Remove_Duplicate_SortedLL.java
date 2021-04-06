package Problems;

public class Remove_Duplicate_SortedLL {

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(30);
        head.next.next.next.next.next=new Node(30);
        printlist(head);
        removeDpus(head);
        printlist(head);
    }

    private static void removeDpus(Node head) {

        Node curr = head;
        while (curr != null && curr.next != null)
        {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
    }


    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
