class Solution {
    public double myPow(double x, long n){
        double res = pow(x, Math.abs(n));
        if(n < 0)
        {
            return 1/res;
        }
        return res;
    }
    public double pow(double x, long n)
    {
        if(n == 0)
        {
            return 1;
        }
        double half = pow(x, n/2);
        half = half*half;

        if(n %2 == 0)
        {
            return half;
        }
        return half*x;
    }
}