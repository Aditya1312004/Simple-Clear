class Solution {
    public char kthCharacter(int k) {
        String word= "a";

        while(word.length()<k){
            String str = "";
            for(char ch : word.toCharArray()){
                str+= (char) (ch+1);
            }
            word += str;
        }
        return word.charAt(k-1);
    }
}