package Sorting.MergeSort;

public class Inversion_Count {

    public static void main(String[] args) {

        int[] inArray = new int[]{2,4,1,3,5};

        //System.out.println("Number of Inversion Present in Array are : "+countInversion1(inArray));
        System.out.println("Number of Inversion Present in Array are : "+countInversion2(inArray,0,inArray.length - 1));
    }

    //Naive Solution
    //In this approach we check two condition
    //arr[i] > arr[j]
    //i < j
    private static int countInversion1(int[] inArray) {

        int result = 0;

        for (int i = 0; i < inArray.length - 1; i++) {
            for (int j = i+1; j < inArray.length; j++) {
                if(inArray[i] > inArray[j])
                    result++;
            }
        }
        return result;
    }

    //efficient solution O(nlogn) times and O(n) space
    // in this approach we will use merge sort algorithm

    private static int countInversion2(int[] inArray, int l, int r) {

        int res = 0;
        if(l < r){
            int m = l + (r - l) / 2;
            res += countInversion2(inArray, l, m);
            res += countInversion2(inArray, m+1, r);
            res += countAndMerge(inArray, l, m, r);
    }
        return res;
}

    private static int countAndMerge(int[] inArray, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = inArray[i+l];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = inArray[m+1+j];
        }

        int res = 0, i = 0, j = 0, k = l;
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j]){
                inArray[k++] = left[i++];
            }
            else
            {
                inArray[k++] = right[j++];
                res = res+(n1 - 1);
            }
        }
        while (i < n1)
        {
            inArray[k++] = left[i++];
        }
        while(j < n2)
        {
            inArray[k++] = right[j++];
        }
        return res;
    }
}
