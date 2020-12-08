
//given a sorted and rotated array of distinct element and
//an element x find if x is present in the array or not

package Searching.Binary_Search;

public class Challenge9 {

    public static void main(String[] args) {

        int[] inArray = { 10, 20, 40, 5, 6, 7, 8};
        int x = 6;
        int n = (inArray.length - 1) - 0 + 1;

        int index = search(inArray, x, n);

        System.out.println("Element "+x+" found at index "+index);
    }

    private static int search(int[] inArray, int x, int n) {

        int low =0, high = n - 1;

        while( low <= high)
        {
            int mid = low +(high - low) / 2;

            if(inArray[mid] == x)
                return mid;
            if (inArray[low] < inArray[mid]) {

                if ( x >= inArray[low] && x < inArray[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else
            {
                if ( x > inArray[mid] && x <= inArray[high])
                    low = mid + 1;
                else
                    high = mid - 1;

            }

        }
        return -1;
    }
}

