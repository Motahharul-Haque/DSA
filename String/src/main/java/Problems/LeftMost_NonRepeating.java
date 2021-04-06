package Problems;

import java.util.Arrays;

public class LeftMost_NonRepeating {

    static final int CHAR = 256;
    public static void main(String[] args) {
        String str = "codingforcoders";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }

    private static int nonRep(String str) {
        int[] fI =  new int[CHAR];
        Arrays.fill(fI, -1);

        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)] == -1) {
                fI[str.charAt(i)] = i;
            }
            else {
                fI[str.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i< CHAR; i++)
        {
            if (fI[i] >= 0) {
                res = Math.min(res, fI[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }


}
