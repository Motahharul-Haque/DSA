package Stack;

import java.util.Stack;

public class SpanStackEff {

    public static void main(String[] args) {
        int[] arr= new int[]{18,12,13,14,11,16};
        printSpan(arr, arr.length);
    }

    private static void printSpan(int[] arr, int length) {
        Stack<Integer> s = new Stack<>();
        s.add(0);
        System.out.println(1 + " ");

        for (int i = 1; i < length; i++) {
           while (s.isEmpty() == false && arr[s.peek()] <= arr[i])
           {
               s.pop();
           }
           int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.println(span + " ");
            s.push(i);
        }
    }
}
