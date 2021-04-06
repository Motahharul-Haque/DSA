package PatternMatching;

public class KMPAlgo {

    public static void main(String[] args) {
        String txt = "abacabad";
        int[] lps = new int[txt.length()];
        fillLPS(txt, lps);
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(lps[i]+" ");
        }
    }

    private static void fillLPS(String txt, int[] lps) {
        int n = txt.length(), len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < n)
        {
            if (txt.charAt(i) == txt.charAt(len)) {
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
                else
                {
                    len = lps[len - 1];
                }
            }
        }
    }
}
