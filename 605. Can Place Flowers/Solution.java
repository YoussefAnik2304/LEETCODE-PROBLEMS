class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int l = fb.length;
        for(int i=0; n>0 && i<l; i+=2){
            if (fb[i]==1) continue;
            if(i == l-1 || fb[i+1]==0) n--;
            else i++;
        }
        return n<1;
    }
}
