package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeEx4 {
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();

        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        Iterator it = d.descendingIterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");

    }
}
