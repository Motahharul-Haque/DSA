package Problems;

import java.util.HashMap;

class CloneLinkedListRandomPointer {

    public static void print(Node1 start)
    {
        Node1 ptr = start;
        while (ptr!=null)
        {
            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data );
            ptr = ptr.next;
        }
    }

    public static Node1 clone(Node1 head)
    {
        Node1 next,temp;
        for(Node1 curr=head;curr!=null;){
            next=curr.next;
            curr.next=new Node1(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(Node1 curr=head;curr!=null;curr=curr.next.next){
            curr.next.random=(curr.random!=null)?(curr.random.next):null;
        }

        Node1 original = head, copy = head.next;

        temp = copy;

        while (original!=null && copy!=null)
        {
            original.next =
                    original.next!=null? original.next.next : original.next;

            copy.next = copy.next!=null?copy.next.next:copy.next;
            original = original.next;
            copy = copy.next;
        }

        return temp;
    }
    public static void main(String[] args)
    {
        Node1 head = new Node1(10);
        head.next = new Node1(5);
        head.next.next = new Node1(20);
        head.next.next.next = new Node1(15);
        head.next.next.next.next = new Node1(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print( "Original list : \n");
        print(head);

        System.out.print( "\nCloned list : \n");
        Node1 cloned_list = clone(head);
        print(cloned_list);
    }
}
