package Searching.Binary_Search.Two_Pointers;

public class PairSum_Sorted_Array {

    public static void main(String[] args) {

        int[] inArray = { 2, 5, 12, 30};
        int sum = 17;
        int len = inArray.length;

        System.out.println(isPresent(inArray, len, sum));
    }

    private static int isPresent(int[] inArray, int len, int sum) {

        int low = 0, high = len - 1;

        while (low < high) {
            if (inArray[low] + inArray[high] == sum)
                return 1;
            else if (inArray[low] + inArray[high] > sum)
                high--;
            else
                low++;
        }
        return 0;
    }
}

