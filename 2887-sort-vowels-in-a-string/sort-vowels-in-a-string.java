class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Character> po = new ArrayList<>();

        for(int i=0;i<sb.length();i++){
            char c= sb.charAt(i);
            if(vowel(c)){
                po.add(c);
            }

            
        }
        Collections.sort(po);
        int idx = 0;
        for(int i=0;i<s.length();i++){
            if(vowel(sb.charAt(i))){
                sb.setCharAt(i , po.get(idx++));
            }
        }
        return sb.toString();
    }
    public boolean vowel(char c){
        return "aeioouAEIOU".indexOf(c) != -1;
    }
}