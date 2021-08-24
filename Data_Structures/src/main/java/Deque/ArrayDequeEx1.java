package Deque;

import java.util.ArrayDeque;

public class ArrayDequeEx1 {
    public static void main(String args[])
    {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        ad.add(10);
        ad.add(20);
        ad.add(30);

        System.out.println(ad);
    }
}
