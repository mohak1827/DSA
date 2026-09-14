class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }
            else
            {
               int j = st.pop();
               if(st.size()==0)
               {
                sb.append(s.substring(j+1,i));
               }
            }
        }
        return sb.toString();
    }
}