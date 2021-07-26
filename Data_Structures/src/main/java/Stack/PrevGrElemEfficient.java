package Stack;

import java.util.Stack;

public class PrevGrElemEfficient {

    public static void main(String[] args) {
        int[] arr = {20, 30, 10, 5, 15};

        printPrevGreater(arr, arr.length);
    }

    private static void printPrevGreater(int[] arr, int length) {

        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 0; i < length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.println(pg+" ");
            s.add(arr[i]);
        }
    }
}
