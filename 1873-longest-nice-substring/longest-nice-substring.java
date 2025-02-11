class Solution {
    public String longestNiceSubstring(String s) {
        String result =""; 
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp = s.substring(i,j); 
                if(temp.length()>1 && result.length()<temp.length() && isNice(temp)) result = temp;
            }

        }
        return result;
    }

    public boolean isNice(String temp){
        Set<Character> lk = new HashSet<>();
        
        for(char ch : temp.toCharArray() ) lk.add(ch);

        for(char ch : lk)
            if(lk.contains(Character.toUpperCase(ch))  != lk.contains(Character.toLowerCase(ch)) )  return false;
        return true;
    }
}
