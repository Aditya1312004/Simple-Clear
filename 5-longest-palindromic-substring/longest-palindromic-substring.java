class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() < 1)return "";
        int maxl = 0;
        String longest = "";
        
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String sub = s.substring(i , j+1);
                if(isPalindrome(sub)&& sub.length() > maxl){
                    maxl = sub.length();
                    longest = sub;
                }
            }
        }
        return longest;
    }
    public static boolean isPalindrome(String s){
        int start =0; 
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)) return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}