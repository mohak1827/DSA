class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] arr = {-1,-1,-1};
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            arr[s.charAt(i)-'a']=i;
            int min = Math.min(arr[0],Math.min(arr[1],arr[2]));
            if(min != -1)
            {
                count += min+1;
            }
        }
        return count;
    }
}