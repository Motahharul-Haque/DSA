package Problems;

public class Recursive_Rev_LL_Methosd2 {

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);
        head=recRevL(head,null);
        printlist(head);
    }

    private static Node recRevL(Node curr, Node prev ) {
        if (curr == null) {
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        return recRevL(next, curr);
    }


    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
