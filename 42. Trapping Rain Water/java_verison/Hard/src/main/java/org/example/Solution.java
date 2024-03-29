package org.example;

import java.util.Arrays;

class Solution {
    public int trap(int[] height) {
        int size =height.length ;
        int [] left =new int[size];
        int [] right=new int[size];
        Arrays.fill(left,0);
        Arrays.fill(right,0);
        left[0]=height[0];
        for (int i =1;i<size;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[size-1]=height[size-1];
        for (int j=size-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j]);
        }
        int water=0;
        for (int k=0;k<size;k++){
            water+=Math.min(left[k],right[k])-height[k];
        }
        return water ;

    }
}