
//index of first occurrence of an element recursive solution

package Searching.Binary_Search;

public class Challenge6a {

    public static void main(String[] args) {

        int[] inArray = {1, 10, 10, 10, 20, 30, 40, 50};
        int x = 20;//element to be search
        int low = 0, high = inArray.length - 1;

        int index = firstOccurrence(inArray, low, high, x);

        System.out.println("Element "+x+" first time occur at index : "+index);

    }

    private static int firstOccurrence(int[] inArray, int low, int high, int x) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if(inArray[mid] > x)
            return firstOccurrence(inArray, low, mid - 1, x);
        else if (inArray[mid] < x)
            return firstOccurrence(inArray, mid + 1, high, x);
        else
        {
            if (mid == 0 || inArray[mid - 1] != inArray[mid])
                return mid;
            else
                return firstOccurrence(inArray, low, mid - 1, x);

        }

    }
}
