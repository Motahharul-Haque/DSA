package Stack;

import java.util.ArrayList;

public class MyStack1 {

    ArrayList<Integer> al = new ArrayList<>();

    void push(int x)
    {
        al.add(x);
    }

    int pop()
    {
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    int peek()
    {
        return al.get(al.size() - 1);
    }

    int size()
    {
        return al.size();
    }

    boolean isEmpty()
    {
        return al.isEmpty();
    }
}
class Test1
{
    public static void main(String[] args) {
        MyStack1 stack = new MyStack1();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
