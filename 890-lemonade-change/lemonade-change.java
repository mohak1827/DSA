class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fv = 0;
        int tn = 0;
        for(int i = 0; i < bills.length; i++)
        {
            if(bills[i] == 5)
            {
                fv++;
            }
            else if(bills[i] == 10)
            {
                if(fv > 0)
                {
                    tn++;
                    fv--;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(tn > 0 && fv > 0)
                {
                    tn--;
                    fv--;
                }
                else if(fv >= 3)
                {
                    fv -= 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}