package Problems;

import java.util.HashSet;

public class PairSum_Unsorted {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 4, 7, 6, 1};
        int n = arr.length;
        int sum = 14;

        System.out.println(pairWithSum(arr, n, sum));
    }

    private static int pairWithSum(int[] arr, int n, int sum) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (h.contains(sum - arr[i]))
                return 1;
            h.add(arr[i]);
        }
        return 0;
    }
}
