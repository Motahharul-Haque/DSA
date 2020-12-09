package Searching.Binary_Search;

import java.util.HashSet;

public class PairSum {

    public static void printPairs(int[] inArray, int sum)
    {
        HashSet<Integer> s= new HashSet<>();

        for (int i = 0; i < inArray.length; i++) {

            int temp = sum - inArray[i];

            if ( s.contains(temp)) {

                System.out.println("Pair with given sum "+sum+" is ("+inArray[i]+" , "+temp+")");
            }
            s.add(inArray[i]);
        }
    }

    public static void main(String[] args) {

        int[] inArray = { 3, 5, 9, 2, 8, 10, 11};
        int n = 17;

        printPairs(inArray, n);
    }
}
