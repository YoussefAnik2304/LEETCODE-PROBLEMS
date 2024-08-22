class Solution {
    public boolean increasingTriplet(int[] nums) {
        int rightmin=nums[0];
        int [] rm =new int[nums.length];
        for (int i =0;i<nums.length;i++){
            if(rightmin>nums[i])
                rightmin=nums[i];
            rm[i]=rightmin;
        }
        int leftmax=nums[nums.length-1];
        int [] lm =new int [nums.length];
        for (int j =nums.length-1;j>=0;j--){
            if(leftmax<nums[j])
                leftmax=nums[j];
            lm[j]=leftmax;
        }

        for (int k =0;k<nums.length;k++){
            if(rm[k]<nums[k] && nums[k]<lm[k])
                return true ;
        }
        return false ;
    }
}