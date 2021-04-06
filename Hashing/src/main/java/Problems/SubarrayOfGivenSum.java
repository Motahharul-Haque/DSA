package Problems;

import java.util.HashSet;

public class SubarrayOfGivenSum {

    public static void main(String[] args) {
        int[] arr = { 5, 8, 6, 13, 3, -1};
        int sum = 22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }

    private static boolean isSum(int[] arr, int n, int sum) {

        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;

        for (int i = 0; i < n; i++) {
            if (pre_sum == sum) {
                return true;
            }
            pre_sum += arr[i];

            if (h.contains(pre_sum - sum) == true) {
                return true;
            }
        }
        return true;
    }
}
