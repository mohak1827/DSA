class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int c = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++)
        {
            while(nums[r] == 0 && l <= r)
            {
                l++;
            }
            c = Math.max(c, r-l+1);
        }
        return c;
    }
}