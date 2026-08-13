class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i != l && nums[i] != 0)
            {
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;
                l++;
            }
            if(i == l && nums[i] != 0)
            {
                l++;
            }
        }
    }
}