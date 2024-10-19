import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public String reverseVowels(String s) {
        // Convert string to a char array to modify it
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move 'left' pointer until it finds a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            // Move 'right' pointer until it finds a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                
                // Move the pointers after the swap
                left++;
                right--;
            }
        }
        
        // Return the modified string
        return new String(chars);
    }

    public boolean isVowel(char c) {
        // Set of vowels (both lowercase and uppercase)
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o',  'O', 'u', 'U'));
        return vowels.contains(c);
    }
}
