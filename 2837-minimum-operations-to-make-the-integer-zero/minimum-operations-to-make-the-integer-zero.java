class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k = 0;k<=60;k++){
            long val = (long)num1 - (long)k*num2;
            if(val <0 )continue;
            int bitcount = Long.bitCount(val);

            if(bitcount <=k && k<=val){
                return k;
            } 
        }
        return -1;
    }
}