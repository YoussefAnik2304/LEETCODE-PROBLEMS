//14ms
public class Solution{
    public String convert (String s , int numRows){
        if(s.length()==1 || numRows==1)
            return s; 
        String result ="";
        for (int i =0;i<numRows;i++){
            int incr=2 *(numRows-1);
            for (int j =i; j<s.length();j+=incr){
                result+=s.charAt(j);
                if(i>0 && i<numRows-1 && j + incr -2*i <s.length())
                    result+=s.charAt(j + incr -2*i);
            }
        }
        return result;
    }
}
//2ms 
public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s; // Special cases, no need for zigzag
        }

        StringBuilder result = new StringBuilder();
        
        // Length of the input string
        int n = s.length();
        
        // Step increment for each row
        int incr = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += incr) {
                // Add the character for the current row and current column
                result.append(s.charAt(j));
                
                // For middle rows, add the "diagonal" characters if they exist
                if (i > 0 && i < numRows - 1 && j + incr - 2 * i < n) {
                    result.append(s.charAt(j + incr - 2 * i));
                }
            }
        }
        
        return result.toString();
    }
}
