package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx1 {
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();

        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);

        System.out.println(d.peekFirst());

        System.out.println(d.peekLast());

        d.pollFirst();

        d.pollLast();

        System.out.println(d.peekFirst());

        System.out.println(d.peekLast());
    }
}
