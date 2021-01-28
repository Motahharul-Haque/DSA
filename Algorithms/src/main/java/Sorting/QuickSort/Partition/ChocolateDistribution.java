package Sorting.QuickSort.Partition;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int[] inArray = { 7, 3, 2, 4, 9, 12, 56};
        int len = inArray.length;
        int m = 3;
        System.out.println(minDiff(inArray, len, m));
    }

    private static int minDiff(int[] inArray, int len, int m) {

        if(m > len)
            return -1;
        Arrays.sort(inArray);
        int res = inArray[m - 1] - inArray[0];

        for (int i = 0; (i + m - 1) < len; i++) {
            res = Math.min(res, inArray[i + m - 1] - inArray[i]);
        }
        return res;
    }
}
