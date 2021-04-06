package Problems;

import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 4, 2, 10, 13};
        int n = arr.length;

        System.out.println(longestConsecutiveSeq(arr, n));
    }

    private static int longestConsecutiveSeq(int[] arr, int n) {

        HashSet<Integer> s = new HashSet<>();
        int res = 0;

        for (int i = 0; i < n; i++) {
            s.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if(!s.contains(arr[i] - 1))
            {
               int curr = 1;
               while (s.contains(curr + arr[i]))
                   curr++;

               res = Math.max(res, curr);
            }
        }
        return res;

    }
}
