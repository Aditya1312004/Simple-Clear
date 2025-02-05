class Solution {
    public String freqAlphabets(String s) {
        int n= s.length();
        StringBuilder sh = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '#'){
                int num = Integer.parseInt(s.substring(i-2 , i));
                sh.append((char) ('a' + num-1));
                i-=2;
            } 
            else{
                int num = s.charAt(i) - '0';
                sh.append((char) ('a'+ num-1));
            }
        }
        return sh.reverse().toString();
    }
}