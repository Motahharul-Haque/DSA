package PatternMatching;

public class KMPAlgo_2 {

    public static void main(String[] args) {
        String txt = "ababcababaad";
        String pat = "ababa";
        KMP(pat, txt);
    }

    private static void KMP(String pat, String txt) {
        int N = txt.length();
        int M = pat.length();
        int[] lps = new int[M];
        fillLPS(pat, lps);
        int i = 0, j = 0;

        while (i < N)
        {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Pattern found at index "+(i - j));
                j = lps[j - 1];
            }
            else if(i < N && pat.charAt(j) != txt.charAt(i))
            {
                if (j == 0) {
                    i++;
                }
                else
                {
                    j = lps[j - 1];
                }
            }
        }
    }

    private static void fillLPS(String pat, int[] lps) {
        int n = pat.length(), len = 0;
        lps[0] = 0;
        int i =1;

        while (i < n)
        {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                }
                else {
                    len = lps[len - 1];
                }
            }
        }
    }
}
