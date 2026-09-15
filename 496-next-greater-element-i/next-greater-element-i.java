class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i = m-1; i >= 0; i--)
        {
            while(!st.empty() && st.peek() <= nums2[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        int k = 0;
        int l = 0;
        int res[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    res[i] = ans[j];
                }
            }
        }
        return res;
    }
}