package Problems;

import java.util.HashSet;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] arr1 = { 15, 17, 27, 27, 28, 15};
        int[] arr2 = { 16, 17, 28, 17, 31, 17};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println(intersection(arr1, m, arr2, n));
    }

    private static int intersection(int[] arr1, int m, int[] arr2, int n) {

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < m; i++) {
            h.add(arr1[i]);
        }
        int res = 0;

        for (int i = 0; i < n; i++) {
            if(h.contains(arr2[i]))
            {
                res++;
                h.remove(arr2[i]);
            }
        }
        return res;
    }
}
