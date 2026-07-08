class Solution {
    public int sum(int[] nums, int i, int j)
    {
        int sum = 0;

        for(int idx = i; idx < j; idx++)
        {
            sum += nums[idx];
        }

        return sum;
    }
    public int pivotIndex(int[] nums) {
        
        for(int i = 0; i < nums.length; i++)
        {
            int l = sum(nums, 0, i);
            int r = sum(nums, i + 1, nums.length);

            if(l == r)
            {
                return i;
            }
        }
        
        return -1;
    }
}