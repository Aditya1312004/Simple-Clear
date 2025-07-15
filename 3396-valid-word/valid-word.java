class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        int vowel = 0;
        int consonant = 0;
        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(isvowel(c)){
                vowel++;
            }
            else if(Character.isLetter(c)){
                consonant++;
            }   
            
            
        }
    return vowel>=1 && consonant >=1;
    }
    private boolean isvowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c =='e' || c =='i' || c == 'o' || c =='u';
    }
}
