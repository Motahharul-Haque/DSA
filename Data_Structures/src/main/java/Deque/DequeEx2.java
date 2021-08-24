package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeEx2 {
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();

        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        Iterator it = d.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        for(int x: d)
            System.out.print(x + " ");
        System.out.println();

    }
}
