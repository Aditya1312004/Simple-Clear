class Solution {
    public int numberOfSubstrings(String s) {
        
        int[] has = {-1,-1,-1};
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            has[c - 'a'] = i;
            if(has[0]!=-1 && has[1]!= -1 && has[2] != -1){
                count = count+ (1+Math.min(Math.min(has[0] , has[1]) , has[2]));
            }
        }
        return count;
    }
}