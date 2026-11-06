class Solution {
    public double myPow(double x, int n) {
        double res = pow(x, Math.abs(n));
        if(n < 0)
        {
            return 1/res;
        }
        return res;
    }
    public double pow(double x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        double half = pow(x, n/2);
        half = half * half;
        if(n % 2 == 0)
        {
            return half;
        }
        else
        {
            return half * x;
        }
    }
}