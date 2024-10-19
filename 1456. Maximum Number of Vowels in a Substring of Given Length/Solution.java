import java.util.ArrayList;

class Solution {
    public int maxVowels(String s, int k) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true; // Include uppercase vowels as well
        }
        
        int n = s.length();
        int max = 0;
        int currentCount = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k && i < n; i++) {
            if (vowels[s.charAt(i)]) {
                currentCount++;
            }
        }
        
        max = currentCount;

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove the leftmost element from the window
            if (vowels[s.charAt(i - k)]) {
                currentCount--;
            }
            // Add the new rightmost element to the window
            if (vowels[s.charAt(i)]) {
                currentCount++;
            }
            // Update the maximum count of vowels found
            max = Math.max(max, currentCount);
        }

        return max;
    }
}
