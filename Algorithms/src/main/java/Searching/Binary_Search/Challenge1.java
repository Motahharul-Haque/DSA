
//given a sorted array with repetition find left next index of an element.

package Searching.Binary_Search;

public class Challenge1 {

    public static void main(String[] args) {

        int[] inArray = { 2, 3, 3, 3, 3};

        int index = binarySearch(inArray,0,inArray.length-1,3);

        System.out.println("Left Most Index is : "+index);
    }

    private static int binarySearch(int[] inArray, int low, int high, int x) {

        if(low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (inArray[mid] == x && (mid ==0 || inArray[mid-1] != x)) {
            return mid;
        }
        else if (inArray[mid] >= x ) {
            return binarySearch(inArray, low, mid-1, x);
        }
        else
            return binarySearch(inArray, mid+1, high, x);
    }
}
