package Searching.Binary_Search.Two_Pointers;

import java.util.Arrays;

public class Count_Triplet_Sum {

    public static int findTriplet(int[] inArray, int sum)
    {
        int count = 0;
        Arrays.sort(inArray);

        for (int i = 0; i < inArray.length -  1; i++) {

            int l = i + 1;
            int r = inArray.length - 1;
            int x = inArray[i];

            while (l < r)
            {
                if (x + inArray[l] + inArray[r] == sum) {

                    count++;
                    l++;
                    r--;
                }
                else if (x + inArray[l] + inArray[r] < sum)
                    l++;
                else
                    r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] inArray = { 0, -1, 2, -3, 1 };
        int sum = -2;
        int res = findTriplet(inArray, sum);
        System.out.println("No. of triplets exist in the array : "+ res);
    }

}
