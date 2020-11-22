
//given an infinite sized sorted array and an element x, find if x is present in array or not

package Searching.Binary_Search;

public class Challenge4 {

    public static void main(String[] args) {

        int[] inArray = {1, 8, 20, 40, 80, 90, 100, 120, 140, 145, 151, 157, 160, 163, 167, 177, 180, 190};
        int x = 100; //element to be search

        int index = findInInfArr(inArray, x);

        System.out.println("Element found at index : "+index);
    }

    private static int findInInfArr(int[] inArray, int x) {

        if (inArray[0] == x)
            return 0;

        int i = 1;

        while(inArray[i] < x)
            i*=2;

        if (inArray[i] == x) {
            return i;
        }
        else
                return binarySearch(inArray, i/2, i, x);

    }

    private static int binarySearch(int[] inArray, int low, int high, int x) {

        if(low > high)
            return -1;

        int mid = low + (high -low) / 2;

        if(inArray[mid] == x)
            return mid;
        else if (inArray[mid] > x)
            return binarySearch(inArray, low,mid-1 ,x);
        else
            return binarySearch(inArray, mid+1, high, x);
    }
}
