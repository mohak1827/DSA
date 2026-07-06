class Solution {
    public double minimumAverage(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            max = Math.max(max,n);
        }
        System.out.println(max);
        int[] arr = new int[max+1];
        for(int n : nums){
            arr[n]++;
        }
        int start = 1;
        int end = max;
        double ans = Double.MAX_VALUE;
        while(start <= end){
            while(arr[start] == 0){
                start++;
            }
            while(arr[end] == 0){
                end--;
            }
            ans = Math.min(ans, (double)(start + end)/2);
            if(arr[start] > 1){
                arr[start]--;
            }else{
                start++;
            }
            if(arr[end] > 1){
                arr[end]--;
            }else{
                end--;
            }
        }
        return ans;
    }
}