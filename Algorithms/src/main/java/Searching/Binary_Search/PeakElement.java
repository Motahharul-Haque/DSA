
// find a peak element
//peak element :-> Not smaller than neighbour

package Searching.Binary_Search;

public class PeakElement {

    public static void main(String[] args) {

        //int[] inArray = { 5, 10, 20, 15, 7};
        int[] inArray = {10, 7, 8, 20, 12};

        int n = (inArray.length - 1) + 0 + 1;

        //int index = getPeakNaive(inArray, n);
        int index = getPeakBS(inArray, n);

        System.out.println("Peak element found at index "+index);
    }

    private static int getPeakBS(int[] inArray, int n) {
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(mid == 0 || inArray[mid - 1] <= inArray[mid] && (mid == n - 1)|| inArray[mid + 1] <= inArray[mid])
                return mid;
            else if( mid > 0 && inArray[mid - 1] >= inArray[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    private static int getPeakNaive(int[] inArray, int n) {

        if( n == 1)
            return inArray[0];

        if (inArray[0] >= inArray[1])
            return inArray[0];

        if ( inArray[n - 1] >= inArray[n - 2])
            return inArray[n - 1];

        for (int i = 1; i < n - 1; i++) {
            if ( inArray[i] >= inArray[i - 1] && inArray[i] <= inArray[i + 1]) {
                return inArray[i];

            }
        }
        return -1;
    }
}
