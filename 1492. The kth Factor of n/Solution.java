class Solution {
    public int kthFactor(int n, int k) {
        int result =-1;
        for (int i =1;i<=n;i++){
            if(n%i==0){
                if(k==1){
                    result=i;
                    break;
                }
                k--;
            }
        }
        return result;

    }
}