
//If input is not perfect square return floor of square root

package Searching.Binary_Search;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();

        int res = squareRootFunc(x);

        System.out.println("Square Root : "+res);
    }

    private static int squareRootFunc(int x) {

        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == x)
                return mid;
            else if (mid * mid < x) {
                start = mid + 1;
                ans = mid;

            }
            else
                end = mid-1;
        }
        return ans;
    }
}
