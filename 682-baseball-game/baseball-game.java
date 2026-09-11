class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++)
        {
            char ch = operations[i].charAt(0);
            if(ch == '+')
            {
                int a = st.pop();

                int c = a+st.peek();

                st.push(a);
                st.push(c);
            }
            else if(ch == 'C')
            {
                st.pop();
            }
            else if(ch == 'D')
            {
                int num = st.peek();
                st.push(2*num);
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!st.empty())
        {
            sum += st.pop();
        }
        return sum;
    }
}