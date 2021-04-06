package Problems;

import java.util.HashMap;
import java.util.Map;

public class PrintNByKEfficient {

    public static void main(String[] args) {
        int[] arr = { 30, 10, 20, 20, 20, 10, 40, 30, 30};
        int n = arr.length;
        int k = 4;

        printNByK(arr, n, k);
    }

    private static void printNByK(int[] arr, int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                int count = m.get(arr[i]);
                m.put(arr[i], count + 1);
            } else if (m.size() < k - 1) {
                m.put(arr[i], 1);
            } else {
                for (Map.Entry e : m.entrySet()) {
                    Integer c = (Integer) e.getValue();
                    m.put((Integer) e.getKey(), c - 1);

                    if ((Integer) e.getKey() == 0) {
                        m.remove(e.getKey());
                    }
                }
            }
        }

            for (Map.Entry x : m.entrySet())
            {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if((Integer) x.getKey() == arr[j])
                        count++;
                }
                if (count > n/k) {
                    System.out.print(x.getKey()+"  ");
                }
            }
    }
}
