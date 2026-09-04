class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int l = Integer.MIN_VALUE;
            if(i > 1)
            {
                l = nums[i] + dp[i-2];
            }else l = nums[i];
            int r = 0 + dp[i-1];
            dp[i] = Math.max(l,r);
        }
        return dp[nums.length-1];
    }
    public int helper(int n, int[] nums, int[] dp)
    {
        if(n == 0) return nums[n];
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];

        int l = nums[n] + helper(n-2, nums, dp);
        int r = 0 + helper(n-1, nums, dp);

        return dp[n] = Math.max(l,r);
    }
}