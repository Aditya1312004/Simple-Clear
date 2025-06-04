class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int leftcount = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                if(leftcount>=1){
                    ans+='(';
                }
                leftcount++;
            }
            else{
                if(leftcount>1){
                    ans+=')';
                }
                leftcount--;
            }
        }
        return ans;
    }
}