class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int l = 0;
        int flips = 0;
        for(int r = 0; r < nums.length; r++)
        {
            if(nums[r] == 0)
            {
                flips++;
            }
            if(flips > k)
            {
                if(nums[l] == 0)
                {
                    flips--;
                }
                l++;
            }
            count = Math.max(count,r-l+1);
        }
        return count;
    }
}