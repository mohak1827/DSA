class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;

        int i = 1;
        int j = 1;

        for(int k = 2; k <= n; k++)
        {
            int curr = i+j;
            j = i;
            i = curr;
        }

        return i;
    }
}