class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())  return false; 
        HashMap<Character , Integer> as = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            as.put(c , as.getOrDefault(c , 0)+1);
        }
        for(int j=0;j<t.length();j++){
            char c = t.charAt(j);
            if(!as.containsKey(c) || as.get(c) == 0) return false;
            as.put(c , as.get(c) -1);
        }
        return true;       
    }
}