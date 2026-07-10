class Solution {
    public long countSubarrays(int[] nums, long k) {
        long c = 0L;
        int n = nums.length;
        int l = 0;
        long sum = 0L;
        for(int r = 0; r < n; r++)
        {
            sum += nums[r];
            long score = sum*(r-l+1);
            
                while(score >= k && l <= r)
                {
                    
                    sum -= nums[l];
                    l++;
                    score = sum * (r-l+1);
                    
                }
            
            c += r-l+1;
        }
        return c;
    }
}