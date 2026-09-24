class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<StringBuilder> st2 = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int num = 0;
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
            }
            else if(ch == '[')
            {
                st1.push(num);
                st2.push(ans);
                num = 0;
                ans = new StringBuilder();
            }
            else if(ch == ']')
            {
                StringBuilder str = st2.pop();
                int k = st1.pop();
                for(int i = 0; i < k; i++)
                {
                    str.append(ans);
                }
                ans = str;
            }
            else
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}