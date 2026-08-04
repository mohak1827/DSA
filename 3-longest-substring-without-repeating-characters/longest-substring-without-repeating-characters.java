class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(r < s.length())
        {
            char ch = s.charAt(r);
            if(map.containsKey(ch))
            {
                l = Math.max(map.get(ch)+1,l);
            }
            map.put(ch,r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}