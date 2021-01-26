package Sorting.MergeSort;

public class Merge_2_SortedArr {

    public static void main(String[] args) {

        int[] inArray1 = {10, 15, 20, 40};
        int[] inArray2 = {5, 6, 6, 10, 15};

        merge(inArray1, inArray2);
    }

    private static void merge(int[] inArray1, int[] inArray2) {

        int m = inArray1.length, n= inArray2.length;
        int i = 0, j = 0;

        while(i < m && j < n)
        {
            if(inArray1[i] < inArray2[j])
                System.out.print(inArray1[i++]+" ");
            else
                System.out.print(inArray2[j++]+" ");
        }

        while (i < m)
            System.out.print(inArray1[i++]+" ");

        while(j < n)
            System.out.print(inArray2[j++]+" ");
    }
}

