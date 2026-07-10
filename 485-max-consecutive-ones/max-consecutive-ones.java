class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int c = 0;
        for(int r = 0; r < nums.length; r++)
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