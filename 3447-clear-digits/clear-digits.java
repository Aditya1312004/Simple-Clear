class Solution {
    public String clearDigits(String s) {
        StringBuilder sh = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<= '9' ){
                sh.deleteCharAt(sh.length()-1);
            }
            else{
                sh.append(s.charAt(i));
            }
        }
        return sh.toString();
    }
}