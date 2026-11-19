
class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n){
        long even=(n+1)/2;
        long odd=n/2;
        return (int)((power(5,even)*power(4,odd))%MOD);
    }
    public long power(long base, long exp){
        long ans=1;
        while(exp>0){
            if(exp%2==1){
                ans=(ans*base)%MOD;
            }
            base=(base*base)%MOD;
            exp=exp/2;
        }
        return ans;
    }
}
