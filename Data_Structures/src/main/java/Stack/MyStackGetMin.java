package Stack;

import java.util.Stack;

public class MyStackGetMin {

    Stack<Integer> ms;//main stack
    Stack <Integer> as;//auxiliary stack

    MyStackGetMin()
    {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x)
    {
        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x);
            return;
        }

        ms.add(x);

        if(as.peek() >= ms.peek())
            as.add(x);
    }

    void pop()
    {
        if (ms.peek().equals(as.peek())) {
            as.pop();
        }
        ms.pop();
    }
    int top()
    {
        return ms.peek();
    }

    int getMin()
    {
        return as.peek();
    }
}


class TestGetMin
{
    public static void main(String[] args) {
        MyStackGetMin s = new MyStackGetMin();
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
       // s.pop();
        System.out.println("Minimum element from stack : "+s.getMin());
    }
}