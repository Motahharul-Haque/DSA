package CircularDLL;

class Test {
    
    public static void main(String[] args)
    { 
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
    	head=insertAtHead(head,5);
        head=insertAtHead(head,25);
        head = insertAtEnd(head, 35);
        head = insertAtEnd(head, 45);
    	printList(head);
    	
    } 
    
    public static void printList(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
    
    static Node insertAtHead(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }

    static Node insertAtEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;
    }
} 