package Problems;

import java.util.HashSet;

public class LongSubarrayGivenSum {

    public static void main(String[] args) {
        int[] arr = { 8, 3, -7, -4, 1};
        int n = arr.length;
        int sum = -8;

        System.out.println(largeSubarrayWithSumX(arr, n, sum));
    }

    private static int largeSubarrayWithSumX(int[] arr, int n, int sum) {
        int prefix_sum = 0;
        HashSet<Integer> h = new HashSet<>();
        h.add(0);

        for (int i = 0; i < n; i++) {
            prefix_sum +=arr[i];

            if (h.contains(prefix_sum - sum)) {
                return 1;
            }
            h.add(prefix_sum);
        }
        return 0;
    }
}
