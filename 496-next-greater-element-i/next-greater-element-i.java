class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        Arrays.fill(ans,-1);
        for(int i = 0;i<nums2.length;i++){
            int a = nums2[i];
            for(int j = i+1;j<nums2.length;j++){
                if(nums2[j]>a){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=ans[j];
                    break;
                }
            }
        }
        return nums1;
    }
}