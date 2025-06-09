class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> as = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sa= s.charAt(i);
            char ds = t.charAt(i);

            if(!as.containsKey(sa)){
                if(mapped.contains(ds))
                    return false;
                as.put(sa,ds);
                mapped.add(ds);
            }
            
            else{
                char to = as.get(sa);
                if(to!=ds){
                    return false;
                }
            }
        }
        return true;
    }
}