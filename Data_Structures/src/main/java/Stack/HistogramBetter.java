package Stack;

import java.util.Stack;

public class HistogramBetter {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1 ,5, 6};
        System.out.println("Maximum Area = "+getMaxArea(arr, arr.length));
    }

    private static int getMaxArea(int[] arr, int length) {
        int res = 0;
        int[] ps = new int[length];
        int[] ns = new int[length];
        Stack<Integer> s = new Stack<>();
        s.add(0);

        for (int i = 0; i < length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            int pse = s.isEmpty() ? -1 : s.peek();
            ps[i] = pse;
            s.push(i);
        }
        while (!s.isEmpty()){
            s.pop();
        }
        s.push(length-1);

        for (int i = length-1; i > 0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            int nse = s.isEmpty() ? length : s.peek();
            ns[i] = nse;
            s.add(i);
        }

        for (int i = 0; i < length; i++) {
            int curr = arr[i];
            curr += (i - ps[i] - 1) * arr[i];
            curr += (ns[i] - i - 1) * arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }

}
