class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l = 0;
        int count = 0;
        int sum = 0;
        for(int r = 0; r < nums.length; r++)
        {
            sum += nums[r];
            while(sum > goal)
            {
                sum -= nums[l];
                l++;
            }
            if(sum <= goal)
            {
                count += r-l+1;
            }
        }
        int s = 0;
        int c = 0;
        int le = 0;
        int g = goal-1;
        for(int r = 0; r < nums.length; r++)
        {
            if(g < 0)break;
            s += nums[r];
            while(s > g)
            {
                s -= nums[le];
                le++;
            }
            if(s <= g)
            {
                c += r-le+1;
            }
        }
        return count-c;
    }
}