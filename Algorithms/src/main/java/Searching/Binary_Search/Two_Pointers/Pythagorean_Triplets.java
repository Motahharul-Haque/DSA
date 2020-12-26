package Searching.Binary_Search.Two_Pointers;

import java.util.Arrays;

class Pythagorean_Triplets {
    static void findTriplet(int inArray[])
    {

        for (int i = 0; i < inArray.length ; i++)
            inArray[i] = inArray[i] * inArray[i];

        Arrays.sort(inArray);

        for (int i = inArray.length - 1; i >= 2; i--) {
            // Fix a
            int b = 0; // Fix b
            int c = i - 1; // Fix c

            while (b < c) {
                // A triplet found
                if (inArray[b] + inArray[c] == inArray[i]) {
                    System.out.printf("Triplets: %f, %f, %f\n", new Object[] {Math.sqrt(inArray[b]), Math.sqrt(inArray[c]), Math.sqrt(inArray[i])});
                    b++;
                    c--;
                }
                if (inArray[b] + inArray[c] < inArray[i])
                    b++;
                else
                    c--;
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int inArray[] = { 3, 1, 4, 6, 5 };

        findTriplet(inArray);
    }
} 