class Solution {


    
    
    long  MOD = 1000000007;
    public long power(long x , long y){
        if(y==0) return 1;
         long ans = power(x , y/2);
         ans = (ans * ans) % MOD;

        if(y%2 == 1){
            ans = (ans * x)% MOD;
        }
        return ans;

    }    

    

    public int countGoodNumbers(long n) {
         long even = n / 2+n%2;
        long odd = n/2 ;
        if(n==1){
            return 5;
        }
    long result = (power(5,even) * power(4,odd)) % MOD;
        return (int) result;
}


}