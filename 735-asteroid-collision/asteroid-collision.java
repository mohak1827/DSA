class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++)
        {
            if(asteroids[i] > 0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                while(!st.empty() && Math.abs(asteroids[i]) > st.peek() && st.peek() > 0)
                {
                    st.pop();
                }
                if(!st.empty() && st.peek() == Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                else if(st.empty() || st.peek() < 0)
                {
                    st.push(asteroids[i]);
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