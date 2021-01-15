package Sorting.Arrays.SortMethod;

import java.util.Arrays;

public class SortElement {

    public static void main(String[] args) {
        int[] inArray = {5, 20, 12, 30};
        char[] chArray = {'B', 'B', 'A', 'C', 'A'};

        Arrays.sort(inArray);

        System.out.println(Arrays.toString(inArray));

        Arrays.sort(chArray);

        System.out.println(Arrays.toString(chArray));
    }
}
