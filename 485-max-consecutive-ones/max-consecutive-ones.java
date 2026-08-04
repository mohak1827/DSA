class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0;
        int max = 0;
        int c = 0;
        while(r < nums.length)
        {
            if(nums[r] == 0)
            {
                l = r+1;
            }
            else
            {
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}