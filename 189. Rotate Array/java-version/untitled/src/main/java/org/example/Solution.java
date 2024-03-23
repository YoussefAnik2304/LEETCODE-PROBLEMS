package org.example;
class Solution {
    public void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length]; // Initialize tmp array with zeros

        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(tmp, 0, nums, 0, nums.length);
    }
}