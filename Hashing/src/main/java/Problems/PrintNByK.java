package Problems;

import java.util.HashMap;
import java.util.Map;

public class PrintNByK {

    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 30, 20, 10,10};
        int n = arr.length;
        int k = 2;

        printNByK(arr, n, k);
    }

    private static void printNByK(int[] arr, int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e: m.entrySet())
            if (e.getValue() > n/k) {
                System.out.print(e.getKey()+"  ");
            }
    }
}
