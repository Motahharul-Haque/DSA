package Sorting.Arrays.SortMethod;

import java.util.Arrays;

public class SortSubArray {

    public static void main(String[] args) {
        int[] arr = {5, 30, 20, 10, 8};

        // Sort sub-array from index 1 to 3, i.e.,
        // only sort sub-array {30, 20, 10} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));
    }
}
