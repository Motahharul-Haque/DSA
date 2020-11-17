
//Given a sorted array with repetition count occurrence of an element

package Searching.Binary_Search;

public class Challenge2 {

    public static void main(String[] args) {

        int[] inArray = {2, 3, 3, 3, 3, 3};
        int low = 0;
        int high = inArray.length-1;
        int x = 3; //element to be search
        int n = high - low+ 1;
        int count = binarySearch(inArray, low, high, x, n);

        System.out.println("Element Occurrence Count : "+count);
    }

    private static int binarySearch(int[] inArray, int low, int high, int x, int n) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (inArray[mid] == x && (mid == (n-1) || inArray[mid+1] != x)) {
            return mid;
        }
        else if (inArray[mid] > x) {
            return binarySearch(inArray, low, mid-1, x, n);
        }
        else
            return binarySearch(inArray, mid+1, high, x, n);

    }
}
