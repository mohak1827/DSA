class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() == 1 && !Character.isDigit(tokens[i].charAt(0)))
            {
                char ch = tokens[i].charAt(0);
                if(ch == '+' || ch == '-' || ch == '/' || ch == '*')
                {
                    int p1 = Integer.parseInt(st.pop());
                    int p2 = Integer.parseInt(st.pop());

                    switch(ch)
                    {
                        case '+' :
                            int res = p1+p2;
                            st.push(String.valueOf(res));
                            break;
                        case '-' :
                            res = p2-p1;
                            st.push(String.valueOf(res));
                            break;
                        case '*' :
                            res = p1*p2;
                            st.push(String.valueOf(res));
                            break;
                        case '/' :
                            res = p2/p1;
                            st.push(String.valueOf(res));
                            break;
                        default :
                            break;
                    }
                }
            }
            else
            {
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.peek());
    }
}