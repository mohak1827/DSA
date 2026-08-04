class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
        int l = 0;
        int r = cardPoints.length-1;

        while(l < k)
        {
            lSum += cardPoints[l];
            l++;
        }
        maxSum = lSum;
        l--;
        while(l >= 0)
        {
            lSum -= cardPoints[l];
            rSum += cardPoints[r];

            maxSum = Math.max(maxSum, lSum + rSum);

            l--;
            r--;
        }
        return maxSum;
    }
}