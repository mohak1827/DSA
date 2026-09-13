class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0;
        int right = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                left++;
            }
            else
            {
                right++;
            }
            if(right > left)
            {
                left = right = 0;
            }
        }
        int m1 = left-right;
        //if(m1 <= 0) m1 = Integer.MAX_VALUE;
        left = right = 0;
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == ')')
            {
                right++;
            }
            else
            {
                left++;
            }
            if(left > right)
            {
                left = right = 0;
            }
        }
        int m2 = right - left;
        //if(m2 <= 0) m2 = Integer.MAX_VALUE;
        System.out.println(m1+" "+m2);
        return m1+m2;
    }
}