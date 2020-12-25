package Searching.Binary_Search.Two_Pointers;

import java.util.Arrays;

public class Count_Pair_Sum {

    public static int pair_Count(int[] inArray, int sum)
    {
        int ans = 0, i = 0, j = inArray.length - 1;

        Arrays.sort(inArray);

        while (i < j)
        {
            if (inArray[i] + inArray[j] < sum)
                i++;
            else if (inArray[i] + inArray[j] > sum)
                j--;
            else
            {
                //frequency oof inArray[i]
                int x = inArray[i], xx = i;

                while ((i < j) && (inArray[i] == x))
                    i++;

                //frequency oof inArray[i]
                int y = inArray[j], yy = j;

                while ((j >= i) && (inArray[j] == y))
                    j--;

                //if inArray[i] and inArray[j] are same
                //then remove the extra no counted

                if( x == y)
                {
                    int temp = i - xx + yy - j - 1;
                    ans += (temp * (temp + 1 )) / 2;
                }
                else
                    ans +=(i - xx) * (yy - j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] inArray = { 1, 5, 7, -1, 5 };
        int sum = 6;
        int count = pair_Count(inArray, sum);
        System.out.println("Number of pair exist in the array are : "+count);
    }
}
