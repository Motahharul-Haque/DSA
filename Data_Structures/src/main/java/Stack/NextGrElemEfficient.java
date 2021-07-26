package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGrElemEfficient {

    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};

        for (int x : nextGreater(arr, arr.length)) {
            System.out.println(x+" ");
        }
    }

    private static ArrayList<Integer> nextGreater(int[] arr, int length) {

        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.add(arr[length-1]);
        v.add(-1);

        for (int i = length-2; i >= 0 ; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            int ng = s.isEmpty()? -1 : s.peek();
            v.add(ng);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
}
