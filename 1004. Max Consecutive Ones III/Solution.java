class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0 ; 
        int maxWidth=0;
        int n = nums.length;
        int nbrZeros=0;
        for (int right=0;right<n;right++){
            if(nums[right]==0){
                nbrZeros++;
            }
            while (nbrZeros>k){
                if(nums[left]==0)
                    nbrZeros--;
                left++;
            }
            maxWidth=Math.max(maxWidth,right-left+1);
        }
        return maxWidth;
    }
}
