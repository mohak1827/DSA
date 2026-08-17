class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                idx = i;
                break;
            }
        }
        if(idx != -1)
        {
            for(int k = n - 1; k > idx; k--)
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
        int p = n - 1;
        while(m <= p)
        {
            int t = nums[m];
            nums[m] = nums[p];
            nums[p] = t;

            m++;
            p--;
        }
    }
}