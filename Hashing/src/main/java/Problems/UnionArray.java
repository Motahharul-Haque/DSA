package Problems;

import java.util.HashSet;

public class UnionArray {

    public static void main(String[] args) {
        int[] arr1 = { 2, 8, 3, 5, 6};
        int[] arr2 = { 4, 8, 3, 6, 1};

        int m = arr1.length;
        int n = arr2.length;

        System.out.println(union(arr1, m, arr2, n));
    }

    private static int union(int[] arr1, int m, int[] arr2, int n) {

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < m; i++) {
            h.add(arr1[i]);
        }

        for (int i = 0; i < n; i++) {
            h.add(arr2[i]);
        }

        return h.size();
    }
}
