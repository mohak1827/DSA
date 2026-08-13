class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int max = 0;
        int count=0;
        for(int r = 0; r < nums.length; r++)
        {
            if(nums[r] == 1)
            {
                count++;
            }
            else
            {
                max = Math.max(count,max);
                count = 0;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}