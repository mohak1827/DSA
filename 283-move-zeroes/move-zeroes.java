class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int j = i;
            if(nums[i] == 0){
                while(j < nums.length && nums[j] == 0){
                    j++;
                }
                if(j == nums.length){
                    break;
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}