class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i= 1;i<n;i++){
            int j = n-i;
            if(Nozero(i) && Nozero(j)){
                return new int[]{i,j};
            }

        }
        return new int[]{};
    }
    public boolean Nozero(int num){
        while(num>0){
            if(num%10 == 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}