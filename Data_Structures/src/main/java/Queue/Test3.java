package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        //Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Size " + queue.size());
        System.out.println("Check Empty " + queue.isEmpty());
        System.out.println("Queue " + queue);
        System.out.println("Peek " + queue.peek());
        System.out.println("Poll " + queue.poll());
        System.out.println("Peek " + queue.peek());
    }
}
