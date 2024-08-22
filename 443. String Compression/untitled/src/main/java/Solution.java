
class Solution {
    public int compress(char[] chars) {
        int index = 0; // Index to track the position in the modified chars array

        // Iterate over the characters in chars array
        for (int i = 0; i < chars.length; ) {
            char currentChar = chars[i];
            int count = 0; // Counter for consecutive characters

            // Count consecutive occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Update the original chars array based on compression rules
            chars[index++] = currentChar;
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }

        // Return the new length of the compressed array
        return index;
    }
}

