class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(r < n)
        {
            char ch = s.charAt(r);
            if(set.contains(ch))
            {
                set.remove(s.charAt(l));
                l++;
            }else{
            set.add(ch);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
            }
        }
        return maxLen;
    }
}