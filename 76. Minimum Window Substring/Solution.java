import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        if(t.equals(s))
            return t ; 
        
        Map<String,Integer> counter=new Map<>();
        Map<String,Integer> window=new Map<>();

        for (Char c : t ){
            counter.put(c, counter.getOrDefault(c, 0)+1)
        }
        int have =0,need =counter.size();
        //int [] result=new int [2]; 
        int left=0;
        for (int right=0;right<s.length();right++){
            char c =s[right];
            window[c]=1+window.getOrDefault(c,0);

            if(counter.containsKey(c) && window.get(c)==counter.get(c))
                have++;
            
            while (have==need ){
                //result[0]=left ; result[1]=right;
                window[s[left]]--;
                if(counter.containsKey(s[left]) && window.get(s[left])<counter.get(s[left]))
                    have--;
                left++;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i =left;i<right;i++){
            str.append(s[i]);
        }
        
        return str.toString();
    }
}