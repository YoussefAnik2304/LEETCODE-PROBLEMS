import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            // Start a new line and determine how many words can fit
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                // Check if adding the next word would exceed the line width
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length(); // 1 for the space
                last++;
            }

            // Create the line
            StringBuilder line = new StringBuilder();
            int gaps = last - index - 1;

            // If it's the last line or the line has only one word, left-justify
            if (last == words.length || gaps == 0) {
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) line.append(" ");
                }
                // Add remaining spaces to the end
                while (line.length() < maxWidth) line.append(" ");
            } else {
                // Distribute spaces evenly between words
                int spaces = (maxWidth - totalChars) / gaps;
                int extraSpaces = (maxWidth - totalChars) % gaps;

                for (int i = index; i < last - 1; i++) {
                    line.append(words[i]);
                    line.append(" "); // Space between words
                    for (int j = 0; j < spaces; j++) line.append(" ");
                    if (extraSpaces > 0) {
                        line.append(" ");
                        extraSpaces--;
                    }
                }
                line.append(words[last - 1]); // Add the last word in the line
            }

            result.add(line.toString());
            index = last; // Move to the next line
        }

        return result;
    }

    
}
