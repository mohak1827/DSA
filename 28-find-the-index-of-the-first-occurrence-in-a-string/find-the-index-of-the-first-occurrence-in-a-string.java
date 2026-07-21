class Solution {
    private int[] computeLPS(String s, int n)
    {
        int[] LPS = new int[n];
        int i = 1, len = 0;
        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = LPS[len-1];
                }
                else{
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        return LPS;
    }
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int[] lps = computeLPS(needle, n);
        int m = haystack.length();
        int i = 0;
        int j = 0;
        while(i < m)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
            }
            if(j == n)
            {
                return i - j;
            }
            else if(i < m && haystack.charAt(i) != needle.charAt(j))
            {
                if(j != 0)
                {
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
}