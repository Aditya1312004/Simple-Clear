class Solution {
    public String reverseWords(String a) {
        String[] s = a.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            sb.append(s[i]);
            if(i>0){
            sb.append(" ");
            }
        }
        return sb.toString();
    }
}