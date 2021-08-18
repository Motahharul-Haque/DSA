package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueIterative {
    static Queue<Integer> queue;

    static void print(Queue<Integer> q){
        for (Integer x : q) {
            System.out.print(x + " ");
        }
    }

    static void reverseItr(){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);
        reverseItr();
        print(queue);
    }
}
