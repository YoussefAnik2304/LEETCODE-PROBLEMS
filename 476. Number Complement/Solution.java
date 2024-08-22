class Solution {
    //bit manipulation 
    public int findComplement(int num) {
        if (num == 0) return 1;
        //extract the bitlength of the number 
        int bitLength = Integer.toBinaryString(num).length();
        //the mask of the bit number 
        int mask = (1 << bitLength) - 1;
        //XOR the mask and the number to turn 0 -> 1 and 1 -> 0
        return num ^ mask;
    }
}