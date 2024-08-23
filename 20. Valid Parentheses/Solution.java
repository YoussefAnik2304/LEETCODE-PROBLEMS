class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for (char c : s.toCharArray()){
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } 
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        } 
        return stack.isEmpty();
    }
}