class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        
        HashSet<Character> as = new HashSet<>();
        for(char c: brokenLetters.toCharArray()){
            as.add(c);
        }
        int count = 0;
        for(String s: text.split(" ")){
            boolean o = true;
            for(char c: s.toCharArray()){
                if(as.contains(c)){
                    o = false;
                    break;
                }
            }
                if(o){
                    count++;
                }
            
        }
        return count;
    }
}