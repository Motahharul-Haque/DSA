package Problems;

import java.util.HashMap;
import java.util.Map;

public class LargestZeroSum {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;

        System.out.println(largestZeroSum(arr, len));
    }

    private static int largestZeroSum(int[] arr, int len) {

        Map<Integer, Integer> m = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < len; i++) {
            arr[i] = (arr[i] == 0)? -1 : 1;
        }

        for (int i = 0; i < len; i++) {
            sum +=arr[i];
            if(sum == 0)
                maxLen = i + 1;
            if(m.containsKey(sum + len) == true)
            {
                if(maxLen < i - m.get(sum + len))
                    maxLen = i - m.get(sum + len);

            }else
                m.put(sum + len, i);
        }
        return maxLen;
    }
}
