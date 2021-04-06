package Problems;

import java.util.HashSet;

public class CountDistinctElem {

    public static void main(String[] args) {
        int[] arr = { 15, 16, 27, 27, 28, 15};

        System.out.println(countDistinct(arr));
    }

    private static int countDistinct(int[] arr) {
        int len = arr.length;
        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < len ; i++)
        {
            h.add(arr[i]);
        }
        return h.size();
    }
}
