class Solution {
    public int longestOnes(int[] nums, int k) {

        int count = 0, flip = 0, l = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                flip++;
            }
            while(flip > k)
            {
                if(nums[l] == 0)
                {
                    flip--;
                }
                l++;
            }
            count = Math.max(count, i - l + 1);
        }
        return count;
    }
}