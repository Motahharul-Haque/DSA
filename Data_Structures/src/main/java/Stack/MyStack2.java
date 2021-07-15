package Stack;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
      this.data = data;
      this.next = next;
    }
}
public class MyStack2 {

    Node head;
    int sSize;

    MyStack2()
    {
        head = null;
        sSize = 0;
    }

    void push(int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sSize++;
    }

    int pop()
    {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        sSize--;
        return res;
    }
    int peek()
    {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    int size()
    {
        return sSize;
    }
    boolean isEmpty()
    {
        return head == null;
    }

}

class Test2
{
    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}