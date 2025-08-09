class Solution {
    public int maxVowels(String s, int k) {
        int left= 0;
        int max = 0;
        int count = 0;
        HashSet<Character> as = new HashSet<>(Arrays.asList('a' , 'e' , 'i' , 'o' , 'u'));

        for(int right = 0;right<s.length();right++){
            if(as.contains(s.charAt(right))){
                count++;
            }
            if(right - left +1 > k){
                if(as.contains(s.charAt(left)) ){
                    count--;
                }
                left++;
                
            }
            max = Math.max(max , count);
        }
        return max;
    }
}