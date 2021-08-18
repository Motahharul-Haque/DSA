package Queue;

class Node{
    int key;
    Node next;

    public Node(int key)
    {
        this.key = key;
        this.next = null;
    }
}
class QueueLinkedList {

    Node front, rear;
    public QueueLinkedList(){
        this.front = this.rear = null;
    }
    void enqueue(int key){
        Node temp = new Node(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue(){
        if (this.front == null) {
            return;
        }
        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
    }
}

class Test1{
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue front " + q.front.key);
        System.out.println("Queue rear " + q.rear.key);
    }
}
