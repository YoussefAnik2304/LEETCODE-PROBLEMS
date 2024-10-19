class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies){
            max=Math.max(max,candy);
        }
        for(int candy : candies){
            result.add(candy+extraCandies>=max);
        }
        return result;
    }
}
