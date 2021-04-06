package Problems;

import java.util.HashMap;

public class CommonSum {

    private static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i] - arr2[i];
        }

        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (m.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - m.get(sum));
            }
            else
                m.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = { 1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;

        System.out.println(longestCommonSum(arr1, arr2, n));
    }
}
