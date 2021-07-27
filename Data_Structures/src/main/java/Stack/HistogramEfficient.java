package Stack;

import java.util.Stack;

public class HistogramEfficient {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};
        System.out.println("Maxm Area : "+getMaxArea(arr, arr.length));
    }

    private static int getMaxArea(int[] arr, int length) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int tp;
        int curr;
        for (int i = 0; i < length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                tp = s.peek();
                s.pop();
                curr = arr[tp] * (s.isEmpty() ? i : i - s.peek() - 1);
                res = Math.max(res, curr);
            }
            s.add(i);
        }

        while (!s.isEmpty())
        {
            tp = s.peek();
            s.pop();
            curr = arr[tp] * (s.isEmpty() ? length : length - s.peek() - 1);
            res = Math.max(res, curr);
        }
        return res;
    }
}
