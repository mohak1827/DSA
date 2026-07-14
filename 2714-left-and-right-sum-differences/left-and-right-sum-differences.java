class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 1; i < n; i++)
        {
            nums[i] += nums[i-1];
        }

        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                ans[i] = nums[n-1] - nums[i];
                continue;
            }
            
            int rightSum = nums[n-1] - nums[i];
            int leftSum = nums[i-1];
            System.out.println(nums[n-1] + " " + rightSum + " " + leftSum);
            ans[i] = Math.abs(rightSum - leftSum);
        }
        return ans;
    }
}