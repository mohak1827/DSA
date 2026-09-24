class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        boolean[] remove = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }
            else if(ch == ')')
            {
                if(!st.empty())
                {
                    st.pop();
                }
                else
                {
                    remove[i] = true;
                }
            }
        }
        while(!st.empty())
        {
            remove[st.pop()] = true;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            if(!remove[i])
            {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}