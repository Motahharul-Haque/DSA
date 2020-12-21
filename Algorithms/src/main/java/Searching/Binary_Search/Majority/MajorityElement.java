package Searching.Binary_Search.Majority;

public class MajorityElement {

    public static void main(String[] args) {

        int[] inArray = { 8, 8, 6, 6, 6, 4, 6};
        int n = 7;
        System.out.println(findMajority(inArray, n));
    }

    private static int findMajority(int[] inArray, int n) {
        //logic for finding a candidate
        int res = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if (inArray[res] == inArray[i])
                count++;
            else
                count--;

            if (count == 0) {
                res = i;
                count =1 ;
            }
        }

        //logic for checking that the majority is actually a majority
        count = 0;

        for (int i = 0; i < n; i++) {
            if (inArray[res] == inArray[i])
                count++;
        }

        if (count <= n / 2) {
                res = -1;
        }

        return res;
    }
}
