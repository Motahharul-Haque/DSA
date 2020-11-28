
//index of last occurrence of an element using both method recursive and iterative solution

package Searching.Binary_Search;

public class Challenge7 {

    public static void main(String[] args) {

        int[] inArray = {10, 15, 20, 20, 40, 40};
        int x = 20;//element to be search
        int low = 0;
        int high = inArray.length - 1;
        int n = high - low + 1;

        //int index = LastOccur(inArray, low, high, x, n);

        int index = LastOccurItr(inArray, low, high, x, n);

        System.out.println("Element " + x + " found at last index " + index);

    }

    //Recursive Solution

    private static int LastOccur(int[] inArray, int low, int high, int x, int n) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (inArray[mid] > x)
            return LastOccur(inArray, low, mid - 1, x, n);
        else if (inArray[mid] < x)
            return LastOccur(inArray, mid + 1, high, x, n);
        else {
            if (mid == (n - 1) || inArray[mid + 1] != inArray[mid])
                return mid;
            else
                return LastOccur(inArray, mid + 1, high, x, n);
        }
    }

    //Iterative Solution

    private static int LastOccurItr(int[] inArray, int low, int high, int x, int n) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (inArray[mid] > x)
                high = mid - 1;
            else if (inArray[mid] < x)
                low = mid + 1;
            else {
                if (mid == (n - 1) || inArray[mid + 1] != inArray[mid])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
