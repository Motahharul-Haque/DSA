
//Count Occurrences in sorted array

package Searching.Binary_Search;

public class Challenge8 {

    public static void main(String[] args) {
        int[] inArray = { 10, 20, 20, 20, 20, 20, 30, 30};
        int x =20;
        int low = 0;
        int high = inArray.length - 1;
        int n = high - low + 1;

        int count = countOccur(inArray, low, high, x, n);

        System.out.println("Element "+x+" appeared in sorted array "+count+" times");
    }

    private static int countOccur(int[] inArray, int low, int high, int x, int n) {

        int first = firstOccur(inArray, low, high, x);

        if(first == -1)
            return 0;
        else
            return (lastOccur(inArray, low, high, x, n) - first + 1);
    }

    private static int lastOccur(int[] inArray, int low, int high, int x, int n) {

        if ( low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if(inArray[mid] < x)
            return lastOccur(inArray, mid + 1, high, x, n);
        else if( inArray[mid] > x)
            return lastOccur(inArray, low, mid - 1, x, n);
        else
        {
            if(mid == (n-1) || inArray[mid + 1] != inArray[mid])
                return mid;
            else
                return lastOccur(inArray, mid + 1,high, x, n);
        }

    }

    private static int firstOccur(int[] inArray, int low, int high, int x) {

        if ( low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if(inArray[mid] < x)
            return firstOccur(inArray, mid + 1, high, x);
        else if( inArray[mid] > x)
            return firstOccur(inArray, low, mid - 1, x);
        else
        {
            if(mid == 0 || inArray[mid - 1] != inArray[mid])
                return mid;
            else
                return firstOccur(inArray, low, mid - 1, x);
        }
    }

}
