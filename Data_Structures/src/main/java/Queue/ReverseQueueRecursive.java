package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursive {
    static void print(Queue<Integer> q){
        for (Integer x: q) {
            System.out.println(x + " ");
        }
    }

    static void reverseRec(Queue<Integer> q){
        if (q.isEmpty()) {
            return;
        }
        int x = q.peek();
        q.remove();
        reverseRec(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(5);
        q.add(15);
        q.add(20);
        reverseRec(q);
        print(q);
    }
}
