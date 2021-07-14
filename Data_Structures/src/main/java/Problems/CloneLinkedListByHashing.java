package Problems;

import java.util.HashMap;

public class CloneLinkedListByHashing {

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
        HashMap<Node1,Node1> hm=new HashMap<>();
        for(Node1 curr=head;curr!=null;curr=curr.next)
            hm.put(curr,new Node1(curr.data));

        for(Node1 curr=head;curr!=null;curr=curr.next){
            Node1 cloneCurr=hm.get(curr);
            cloneCurr.next=hm.get(curr.next);
            cloneCurr.random=hm.get(curr.random);
        }
        Node1 head2=hm.get(head);

        return head2;
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

class Node1
{
    int data;
    Node1 next;
    Node1 random;
    Node1(int x)
    {
        data = x;
        next = random = null;
    }
}