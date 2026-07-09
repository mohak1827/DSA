class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int l = 0;
        int n = s.length();
        for(int r = 0; r < s.length(); r++)
        {
            char ch = s.charAt(r);
            while(set.contains(ch))
            {
                set.remove(s.charAt(l));
                l++;
            }
            
            count = Math.max(count, r-l+1);
            set.add(ch);
            
        }
        return count;
    }
}