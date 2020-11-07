package Searching.Binary_Search;

public class BinarySearch_Iterative {

    public static void main(String[] args) {

        int[] inArray = { 10, 20, 30, 40, 50, 60};
        int x = 30; // element to be search

        int index = bSearch(inArray, x);

        System.out.println("Element "+x+" Found at Index : "+index);
    }

    private static int bSearch(int[] inArray, int x) {

        int low = 0, high = inArray.length - 1;

        while( low <= high)
        {
            int mid = low + (high - low) / 2;

            if( inArray[mid] == x)
                return mid;
            else if( inArray[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}
