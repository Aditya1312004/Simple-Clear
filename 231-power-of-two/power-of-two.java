class Solution {
    public boolean isPowerOfTwo(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        if(n<=0) return false;
        for(char c: binary.toCharArray()){
            if(c == '1'){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return count == 1;
    }
}