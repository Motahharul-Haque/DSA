package Stack;

public class HistogramNaive {
    public static void main(String[] args)
    {
        int[] arr={6, 2, 5, 4, 1, 5, 6};
        System.out.println("Maximum Area : "+getMaxArea(arr, arr.length));
    }

    private static int getMaxArea(int[] arr, int length) {
        int res = 0;
        for (int i = 0; i < length; i++) {
            int curr = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j] >= arr[i]) {
                    curr +=arr[i];
                }
                else break;
            }
            for (int j = i+1; j < length; j++) {
                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                }
                else break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}
