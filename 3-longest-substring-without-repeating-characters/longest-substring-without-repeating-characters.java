class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> as = new HashSet<>();
        int l = 0;
        int start = 0;
        for(int j = 0;j<s.length();j++){
            char c= s.charAt(j);
            while(as.contains(c)){
                as.remove(s.charAt(start));
                start++;
            }
            as.add(c);
            l = Math.max(l , j - start +1);
        }
        return l;
    }
}