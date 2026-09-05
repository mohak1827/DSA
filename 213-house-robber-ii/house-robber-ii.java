class Solution {
    public int helper(int st, int end, int[] nums)
    {
        int prev = nums[st];
        int prev2 = 0;

        for(int i = st+1; i < end; i++)
        {
            int take = nums[i] + prev2;
            int ntake = 0 + prev;

            int curr = Math.max(take, ntake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        return Math.max(helper(0,n-1,nums),helper(1,n,nums));
    }
}