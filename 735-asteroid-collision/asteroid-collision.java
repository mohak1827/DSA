class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids)
        {
            if(ast > 0)
            {
                st.push(ast);
            }
            else
            {
                while(!st.empty() && Math.abs(ast) > st.peek() && st.peek() > 0)
                {
                    st.pop();
                }
                if(!st.empty() && st.peek() == Math.abs(ast))
                {
                    st.pop();
                }
                else if(st.empty() || st.peek() < 0)
                {
                    st.push(ast);
                }
            }
        }
        int[] arr = new int[st.size()];
        int idx = arr.length-1;
        while(!st.empty())
        {
            arr[idx] = st.pop();
            idx--; 
        }
        return arr;
    }
}