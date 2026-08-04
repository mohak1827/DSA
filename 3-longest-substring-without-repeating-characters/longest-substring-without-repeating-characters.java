class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(r < n)
        {
            char ch = s.charAt(r);
            if(map.containsKey(ch))
            {
                l = Math.max(l,map.get(ch)+1);
                map.replace(ch,r);
            }
            else map.put(ch,r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}