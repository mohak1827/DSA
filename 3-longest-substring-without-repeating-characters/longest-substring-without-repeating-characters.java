class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxLen = 0;
        int[] arr = new int[128];
        Arrays.fill(arr,-1);
        while(r < n)
        {
            char ch = s.charAt(r);
            if(arr[ch] != -1)
            {
                l = Math.max(l,arr[ch]+1);
            }
            arr[ch]=r;
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}