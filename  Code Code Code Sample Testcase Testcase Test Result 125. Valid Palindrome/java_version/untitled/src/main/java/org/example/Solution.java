package org.example;

public class Solution {
    //my solution 14 ms
    public boolean isPalindrome1(String s) {
        String line =s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i,j;
        for (i=0,j=line.length()-1;j>i;i++,j--){
            if(line.charAt(i)!=line.charAt(j))
                return false;
        }
        return true;
    }
    //others 1ms
    public boolean isPalindrome2(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}
