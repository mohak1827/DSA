class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int maxSum = 0;
        int l = 0;
        int r = cardPoints.length-1;

        while(l < k)
        {
            sum += cardPoints[l];
            l++;
        }
        maxSum = sum;
        l--;
        while(l >= 0)
        {
            sum -= cardPoints[l];
            sum += cardPoints[r];

            maxSum = Math.max(maxSum, sum);

            l--;
            r--;
        }
        return maxSum;
    }
}