package org.example;

public class Solution {
    //just go through the double loop and compute the product O(n²)
    public int[] productExceptSelf_On2(int[] nums) {
        int[] result=new int [nums.length] ;
        for (int i =0 ;i<nums.length;i++){
            int produit =1;
            for (int j=0;j<nums.length;j++){
                if(i!=j){
                    produit*=nums[j];
                }
            }
            result[i]=produit;
        }
        return result;
    }
    //put in the result the predecessor product for each index and then multiply with the post
    public int[] productExceptSelf_On (int[] nums) {
        int[] result=new int [nums.length];
        int pre=1,post=1;
        for (int i =0;i<nums.length;i++){
            result[i]=pre;
            pre*=nums[i];
        }
        for (int j =nums.length-1;j>=0;j--){
            result[j]*=post;
            post*=nums[j];
        }



        return result ;
    }
}
