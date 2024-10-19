class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenating str1+str2 equals str2+str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Get the gcd of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the substring of str1 that represents the gcd string
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to calculate gcd
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
