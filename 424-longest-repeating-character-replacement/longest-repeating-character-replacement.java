class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int l = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int r = 0; r < n; r++)
        {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.get(ch) >= maxFreq){
                maxFreq = map.get(ch);
            }
            
            if(r-l+1-maxFreq <= k)
            {
                maxLen = Math.max(maxLen, r-l+1);
            }
            else{
                while(r-l+1-maxFreq > k)
                {
                    map.replace(s.charAt(l),map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l))==0)
                    {
                        map.remove(s.charAt(l));
                    }
                    l++;
                }
            }
        }
        return maxLen;
    }
}