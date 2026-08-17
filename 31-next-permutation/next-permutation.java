class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                idx = i;
                break;
            }
        }
        if(idx != -1)
        {
            for(int k = nums.length - 1; k > idx; k--)
            {
                if(nums[k] > nums[idx])
                {
                    int temp = nums[idx];
                    nums[idx] = nums[k];
                    nums[k] = temp;
                    break;
                }
            }
        }
        int m = idx+1;
        int n = nums.length - 1;
        while(m <= n)
        {
            int t = nums[m];
            nums[m] = nums[n];
            nums[n] = t;

            m++;
            n--;
        }
    }
}