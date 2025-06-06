class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder as = new StringBuilder(s);
        s=s.trim();
        as.reverse();
        
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<n;i++){
            char c = as.charAt(i);
            if( c!= ' '){
                word.append(as.charAt(i));
            }
            else if(word.length() > 0){
                result.append(word.reverse().toString()).append(" ");
                word.setLength(0);
            }
        }
        if(word.length()>0){
            result.append(word.reverse().toString());
        }
       return result.toString().trim(); 
    }
}