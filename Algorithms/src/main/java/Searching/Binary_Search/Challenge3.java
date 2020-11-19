
//Count 1's in a sorted binary array

package Searching.Binary_Search;

public class Challenge3 {

    public static void main(String[] args) {

        int[] inArray = {0, 0, 1, 1, 1, 1, 1};
        int low = 0;
        int high = inArray.length-1;
        int x = 1; //element to be search
        int n = high - low + 1;

        int count = countOnes(inArray, low, high, n);

        System.out.println("1's Occurrence Count : "+count);
    }

    private static int countOnes(int[] inArray, int low, int high, int n) {

        while( low <= high) {

            int mid = low + (high - low) / 2;

            if (inArray[mid] == 0)
                low = mid + 1;

            else {
                if (mid == 0 || inArray[mid - 1] == 0)
                    return (n - mid);
                else
                    high = mid - 1;
            }
        }

        return 0;
    }
}
