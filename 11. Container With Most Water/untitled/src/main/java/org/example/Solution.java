package org.example;

class Solution {
    public int maxArea(int[] height) {
        int result =0;
        /*for (int i =0;i<height.length;i++){
            for(int j =i+1;j<height.length;j++){
                result=Math.max(result,(j-i)*Math.min(height[i],height[j]));
            }
        }*/
        int l =0,r=height.length-1;
        while(l<r){
            int area=(r-l)*Math.min(height[r],height[l]);
            result=Math.max(result,area);
            if(height[l]<height[r])
                l++;
            else r--;
        }
        return result ;
    }
}