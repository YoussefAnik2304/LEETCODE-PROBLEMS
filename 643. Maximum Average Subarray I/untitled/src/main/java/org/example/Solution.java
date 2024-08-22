package org.example;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE; // Initialize result with the smallest possible value
        int sum = 0;

        // Calculate sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result = Math.max(result, (double) sum / k); // Update result with the average of first 'k' elements

        // Iterate through the array starting from the (k+1)th element
        for (int i = k; i < nums.length; i++) {
            // Update sum by adding the next element and removing the first element of the window
            sum += nums[i] - nums[i - k];
            // Update result if the current average is greater
            result = Math.max(result, (double) sum / k);
        }

        return result;
    }
}
