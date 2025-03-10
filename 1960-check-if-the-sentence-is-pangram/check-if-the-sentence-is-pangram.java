class Solution {
    public boolean checkIfPangram(String sentence) {
       
         if(sentence.length() < 26) return false;
         boolean seen[] = new boolean[26];
         for(char c:sentence.toCharArray()){
            seen[c-'a'] = true;
        }
        for(boolean letterpresent : seen){
            if(!letterpresent) return false;
        }
        return true;
    }
    }