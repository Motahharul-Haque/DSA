
//index of first occurrence of an element iterative solution

package Searching.Binary_Search;

public class Challenge6b {

    public static void main(String[] args) {

        int[] inArray = {1, 10, 10, 10, 20, 30, 40, 50};
        int x = 20;//element to be search


        int index = firstOccurrence(inArray, x);

        System.out.println("Element "+x+" first time occur at index : "+index);

    }

    private static int firstOccurrence(int[] inArray, int x) {

        int low = 0, high = inArray.length - 1;

        while ( low <= high)
        {
            int mid = low + (high - low) / 2;

            if ( inArray[mid] > x)
                high = mid - 1;
            else if (inArray[mid] < x )
                low = mid + 1;
            else
            {
                if (mid == 0 || inArray[mid - 1] != inArray[mid])
                    return mid;
                else
                    high = mid - 1;
            }

        }

        return -1;
    }
}
