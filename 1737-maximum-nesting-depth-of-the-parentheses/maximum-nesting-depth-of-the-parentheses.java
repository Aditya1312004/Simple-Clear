class Solution {
    public int maxDepth(String s) {
        int a = 0;
        int b = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
             a++; 
             b  = Math.max(a , b);  
            }
            else if(c == ')'){
                a--;
            }
           
        }
        return b;
    }
}