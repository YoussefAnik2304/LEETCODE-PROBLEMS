class Solution {
    public int partitionString(String s) {
        HashSet<Character> uniqueChars=new HashSet<>();
        int result=1 ;
        for (char c : s.toCharArray()){
            if(uniqueChars.contains(c)){
                result++;
                uniqueChars=new HashSet();
            }
            uniqueChars.add(c);
        }
        return result ;
    }
}