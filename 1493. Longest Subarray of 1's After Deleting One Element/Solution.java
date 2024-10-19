class Solution {
    public int longestSubarray(int[] nums) {
        int left=0; 
        int deletedOnes = 0 ;
        int maxLength=0;
        int numsLength=nums.length;
        for (int right =0 ; right < numsLength;right++){
            if(nums[right]==0){
                deletedOnes++;
            }
            while (deletedOnes >1){
                if(nums[left++]==0){
                    deletedOnes--;
                }  
            }
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}
